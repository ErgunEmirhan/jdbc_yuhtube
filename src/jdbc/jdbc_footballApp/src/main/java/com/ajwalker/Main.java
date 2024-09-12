package com.ajwalker;

import com.ajwalker.databases.PlayerRepository;
import com.ajwalker.databases.TeamRepository;
import com.ajwalker.entities.Player;
import com.ajwalker.entities.Team;

import java.sql.SQLException;
import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TeamRepository teamRepository = new TeamRepository();
//        Teams team = new Teams("Galatasaray",19323832L);
//        teamRepository.save(team);
//        teamRepository.delete(1);
//        teamRepository.findAll().forEach(System.out::println);
//        teamRepository.findById(2).ifPresent(team -> System.out.println(team));
//        teamRepository.softDelete(2);
//        Optional<Team> updateTeam = teamRepository.findById(3);
//        if (updateTeam.isPresent()) {
//            updateTeam.get().setTeamName("Fenerbahçe");
//            teamRepository.update(updateTeam.get());
//        }
        PlayerRepository playerRepository = new PlayerRepository();
//        playerRepository.save(new Player(2,"Ahmet","22",80,12312));
//        playerRepository.delete(1);
//        playerRepository.findAll().forEach(System.out::println);
//        playerRepository.findById(4).ifPresent(p -> System.out.println(p));
//        playerRepository.softDelete(2);
        Optional<Player> byId = playerRepository.findById(2);
        if (byId.isPresent()) {
            byId.get().setName("Ororr");
            playerRepository.update(byId.get());
        }
    }

}
