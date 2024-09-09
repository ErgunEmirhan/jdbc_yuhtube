package com.ajwalker.databases;

import com.ajwalker.entities.Player;
import com.ajwalker.entities.Team;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PlayerRepository implements ICRUD<Player>{
    private String sql;
    private DatabaseHelper databaseHelper;

    public PlayerRepository() {
        this.databaseHelper = DatabaseHelper.getInstance();
    }
    @Override
    public void save(Player player) {
        sql = "INSERT INTO tblplayers(team_id,player_name,player_age,skill_level,player_value) " +
                "VALUES(%d,'%s','%s',%d,%d)".formatted(
                        player.getTeamID(),
                        player.getName(),
                        player.getAge(),
                        player.getSkillLevel(),
                        player.getValue()
                );
        databaseHelper.executeUpdate(sql);
    }

    @Override
    public void delete(int id) {
        sql = "DELETE FROM tblplayers WHERE player_id="+id;
        databaseHelper.executeUpdate(sql);

    }

    @Override
    public void softDelete(int id) {
        sql = "UPDATE tblplayers SET state=0 WHERE player_id="+id;
        databaseHelper.executeUpdate(sql);
    }

    @Override
    public void update(Player player) {
        sql = "UPDATE tblplayers SET player_name = '%s', player_age = %d, skill_level = %d, player_value = '%s' WHERE player_id=%d".formatted(
                player.getName(), player.getAge(), player.getSkillLevel(), player.getValue(), player.getId()
        );
        databaseHelper.executeUpdate(sql);
    }

    @Override
    public List<Player> findAll(){
        List<Player> players = new ArrayList<>();
        sql = "SELECT * FROM tblplayers";
        Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
        try {
            if(resultSet.isPresent()) {
                ResultSet rs = resultSet.get();
                while (rs.next()){
                    players.add(getPlayerValue(rs));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return players;
    }



    @Override
    public Optional<Player> findById(int id) {
        sql = "SELECT * FROM tblplayers WHERE player_id = " + id;
        Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
        try{
            if (resultSet.isPresent()){
                ResultSet rs = resultSet.get();
                if (rs.next()){
                    Player player = getPlayerValue(rs);

                    return Optional.of(player);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.empty();
    }
    private Player getPlayerValue(ResultSet rs) throws SQLException {
        int id  = rs.getInt("player_id");
        int team_id = rs.getInt("team_id");
        String name = rs.getString("player_name");
        int age = rs.getInt("player_age");
        int skill_level = rs.getInt("skill_level");
        int value = rs.getInt("player_value");
        Player player = new Player(id,team_id,name,age,skill_level,value);
        return player;
    }
}
