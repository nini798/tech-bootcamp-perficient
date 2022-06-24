package com.perficient.techbootcampnicholaschen.melee.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.perficient.techbootcampnicholaschen.melee.domain.Player;
import com.perficient.techbootcampnicholaschen.melee.domain.Team;
import com.perficient.techbootcampnicholaschen.melee.entity.PlayerEntity;
import com.perficient.techbootcampnicholaschen.melee.entity.TeamEntity;

@Service
public class MeleeJpaService {
	@Autowired
	TeamRepository teamRepository;
	@Autowired
	PlayerRepository playerRepository;
	
	public Team getTeam(int teamId) {
		Optional<TeamEntity> teamEntity = teamRepository.findById(teamId);
		
		if(teamEntity.isPresent()) {
			return map(teamEntity.get());
		} else {
			return null;
		}
	}
	
	public Player getPlayer(int playerId) {
		Optional<PlayerEntity> playerEntity = playerRepository.findById(playerId);
		
		if(playerEntity.isPresent()) {
			return map(playerEntity.get());
		} else {
			return null;
		}
	}
	
	public List<Team> getTeams() {
		Iterable<TeamEntity> teamEntities = teamRepository.findAll();
		List<Team> teams = new ArrayList<>();
		for(TeamEntity te : teamEntities) {
			teams.add(map(te));
		}
		return teams;
	}
	
	public List<Player> getPlayers() {
		Iterable<PlayerEntity> playerEntities = playerRepository.findAll();
		List<Player> players = new ArrayList<>();
		for(PlayerEntity pe : playerEntities) {
			players.add(map(pe));
		}
		return players;
	}
	
	public Team createTeam(Team team) {
		List<PlayerEntity> players = new ArrayList<>();
		TeamEntity te = new TeamEntity(team.getName(), team.getInitials(), team.getLogo(), players);
		if(!CollectionUtils.isEmpty(team.getPlayers())) {
			team.getPlayers().forEach(player ->
			{
				if(player.getId() != null) {
					Optional<PlayerEntity> existingPlayer = playerRepository.findById(player.getId());
					if (existingPlayer.isPresent()) {
						players.add(existingPlayer.get());
					} else {
						players.add(new PlayerEntity(player.getName(), player.getMain(), player.getRanking()));
					}
				} else {
					players.add(new PlayerEntity(player.getName(), player.getMain(), player.getRanking()));
				}
			});
		}
		te = teamRepository.save(te);
		return map(te);
	}
	
	private Team map(TeamEntity te) {
        List<Player> players = new ArrayList<>();
        for(PlayerEntity pe : te.getPlayerList()) {
            players.add(map(pe));
        }
        return new Team(te.getTeamId(), te.getName(), te.getInitials(), te.getLogo(), players);
    }
	
	private Player map(PlayerEntity pe) {
		return new Player(pe.getPlayerId(), pe.getName(), pe.getMain(), pe.getRanking());
	}
	
}
