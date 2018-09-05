package com.soccerleague.SoccerLeague.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MembersRepo extends JpaRepository<Members, Long> {

	//List<Teams> findAllByMemberid(String list);

	//List<Members> findAll(String list);
	


}
