package com.wipro.MovFlix.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.MovFlix.model.Movies;

@Repository
public interface UserRepository extends JpaRepository<Movies,String> {
	Movies findByMovieId(String movieId);
	Movies findByMovieName(String movieName);
	Movies findByCollection(int collection);
	Movies save(Movies Movie);

}
