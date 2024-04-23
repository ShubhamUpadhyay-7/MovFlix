package com.wipro.MovFlix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movies {
	
	@Id
	@Column(unique=true)
	String movieId;
	
	@Column(unique=true)
	String movieName;
	
	@Column
	int collection;
	public Movies() {
		
	};
	
	public Movies(String movieId, String movieName, int collection) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.collection = collection;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getCollection() {
		return collection;
	}

	public void setCollection(int collection) {
		this.collection = collection;
	}

}
