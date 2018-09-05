package com.soccerleague.SoccerLeague.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamsRepo extends JpaRepository<Teams, Long> {

	//List<Teams> findAllByTeamid(String list);

}
