package com.wipro.MovFlix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.MovFlix.model.Movies;
import com.wipro.MovFlix.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/new")
	public String addNewMovie(Model model) {
		model.addAttribute("Movies",new Movies());
		return "movieEntry";
	}
	
	@PostMapping("/save")
	public String saveMovies(@ModelAttribute("Movies") Movies movies,@RequestParam("movieId") String movieId) {
		movies.setMovieId(movieId);
		adminService.saveMovie(movies);
		return "successful";
		
	}
	


}
