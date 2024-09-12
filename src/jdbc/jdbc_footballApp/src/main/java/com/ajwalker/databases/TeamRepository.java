package com.ajwalker.databases;

import com.ajwalker.entities.Team;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TeamRepository implements ICRUD<Team> {
    private DatabaseHelper databaseHelper;
    private String sql;

    public TeamRepository() {
        this.databaseHelper =  DatabaseHelper.getInstance();
    }

    @Override
    public void save(Team team) {
        sql = "INSERT INTO tblteams" +
                "(team_name, budget) VALUES ('%s', %d)".formatted(
                        team.getTeamName(), team.getBudget()
                        );
        databaseHelper.executeUpdate(sql);
    }

    @Override
    public void delete(int id) {
        sql = "DELETE FROM tblteams WHERE team_id = " + id;
        databaseHelper.executeUpdate(sql);
    }

    @Override
    public void update(Team team) {
        sql = "UPDATE tblteams SET team_name = '%s', budget = '%s' WHERE team_id = %d".formatted(
                team.getTeamName(), team.getBudget(), team.getId()
        );
        databaseHelper.executeUpdate(sql);
    }

    @Override
    public List findAll() {
        sql = "SELECT * FROM tblteams ORDER BY team_id ASC";
        Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
        List<Team> teams = new ArrayList<>();
        try {
            if (resultSet.isPresent()) {
                ResultSet rs = resultSet.get();
                while (rs.next()){
                    teams.add(getValueTeam(rs));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return teams;
    }
    @Override
    public void softDelete(int id){
        sql = "UPDATE tblteams SET state = 0 WHERE team_id =" + id;
        databaseHelper.executeUpdate(sql);
    }


    @Override
    public Optional findById(int id) {
        sql = "SELECT * FROM tblteams WHERE team_id = " + id;
        Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
        try{
            if (resultSet.isPresent()){
                ResultSet rs = resultSet.get();
                if (rs.next()){
                    Team team = getValueTeam(rs);

                    return Optional.of(team);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.empty();
    }

    private Team getValueTeam(ResultSet rs) throws SQLException {
        int id = rs.getInt("team_id");
        String ad = rs.getString("team_name");
        Long budget = rs.getLong("budget");
        Team team = new Team(id, ad, budget);
        return team;
    }

}
