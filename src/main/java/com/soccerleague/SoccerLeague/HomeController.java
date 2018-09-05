package com.soccerleague.SoccerLeague;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.soccerleague.SoccerLeague.entity.MembersRepo;
import com.soccerleague.SoccerLeague.entity.TeamsRepo;

@Controller
public class HomeController {
	
	@Autowired 
	TeamsRepo teamRepo;
	
	@Autowired 
	MembersRepo membersRepo;

	@RequestMapping("/")
	public ModelAndView index()  {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/membershome")
	public ModelAndView members()  {
	return new ModelAndView("membershome", "test", membersRepo.findAll());	
	}
	
	@RequestMapping("/teampage")
	public ModelAndView team()  {
	return new ModelAndView("teampage", "test2",  teamRepo.findAll());
	}

	
}
