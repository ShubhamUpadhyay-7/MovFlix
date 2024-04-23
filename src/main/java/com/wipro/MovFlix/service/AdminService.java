package com.wipro.MovFlix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.MovFlix.model.Movies;
import com.wipro.MovFlix.repository.UserRepository;

@Service
public class AdminService {
	
	@Autowired
	private UserRepository adminRepository;
	
	public Movies saveMovie(Movies Movie) {
		return adminRepository.save(Movie);
	}

}
