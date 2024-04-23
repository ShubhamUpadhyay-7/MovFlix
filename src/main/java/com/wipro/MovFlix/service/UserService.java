package com.wipro.MovFlix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.MovFlix.model.Movies;
import com.wipro.MovFlix.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Movies findByMovieId(String movieId) {
		return userRepository.findByMovieId(movieId);
	}
	public Movies findByMovieName(String movieName) {
		return userRepository.findByMovieName(movieName);
	}
	public Movies findByCollection(int collection) {
		return userRepository.findByCollection(collection);
	}
	
//	public List<Movies> findByCollectionRange(int minCollection, int maxCollection) {
//        return userRepository.findByCollectionRange(minCollection, maxCollection);
//    }
}
