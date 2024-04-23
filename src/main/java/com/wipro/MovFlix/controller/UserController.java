package com.wipro.MovFlix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.MovFlix.model.Movies;
import com.wipro.MovFlix.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/findByMovieId")
	public String findByMovieId() {
		return "findbyid";
	}
	
	
	@PostMapping("/findByMovieId")
	public String findByMovieId(@RequestParam("movieId")String movieId,Model model) {
		Movies movie = userService.findByMovieId(movieId);
        model.addAttribute("movie", movie);
        return "movie_details";	
	}
	
	@GetMapping("/findByMovieName")
	public String findByMovieName() {
		return "findbyname";
	}
	
	
	@PostMapping("/findByMovieName")
	public String findByMovieName(@RequestParam("movieName")String movieName,Model model) {
		Movies movie = userService.findByMovieName(movieName);
        model.addAttribute("movie", movie);
        return "movie_details";	
	}
	
	@GetMapping("/findByCollection")
	public String findByCollection() {
		return "findbycollection";
	}
	
	
	@PostMapping("/findByCollection")
	public String findByCollection(@RequestParam("collection")int collection,Model model) {
		Movies movie = userService.findByCollection(collection);
        model.addAttribute("movie", movie);
        return "movie_details";	
	}
	
//	@GetMapping("/searchByCollection")
//	public String searchByCollection(@RequestParam("minCollection") int minCollection,
//	                                 @RequestParam("maxCollection") int maxCollection,
//	                                 Model model) {
//	    List<Movies> movies = userService.findByCollectionRange(minCollection, maxCollection);
//	    model.addAttribute("movies", movies);
//	    return "searchResults"; // A JSP page to display the search results
//	}
	
	
	

}
