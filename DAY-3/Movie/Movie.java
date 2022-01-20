package com.org;

public class Movie {
	private String movieName;
	private String producedBy;
	private String directedBy;
	private int duration;
	private int releasedYear;
	private String category;	
	static int movieCount;
	{
		movieCount++;
	}
	public Movie(String movieName, String producedBy) {
		
		this.movieName = movieName;
		this.producedBy = producedBy;
	}
public Movie(String moviename,String producer,String director,int duratio,int releasedyear,String category){
	this.movieName=moviename;
	this.producedBy=producer;
	this.directedBy=director;
	this.duration=duration;
	this.releasedYear=releasedyear;
	this.category=category;
}

public String getMovienname() {
	return movieName;
}

public void setMovienname(String movienname) {
	this.movieName = movienname;
}

public String getProducer() {
	return producedBy;
}

public void setProducer(String producer) {
	this.producedBy = producer;
}

public String getDirector() {
	return directedBy;
}

public void setDirector(String director) {
	this.directedBy = director;
}

public int getDuration() {
	return duration;
}

public void setDuration(int duration) {
	this.duration = duration;
}

public int getReleasedyear() {
	return releasedYear;
}

public void setReleasedyear(int releasedyear) {
	this.releasedYear = releasedyear;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}	
	public String showDetails() {
		
		 return "Movie Name is : " + movieName + "\r\n  Produced By : " + producedBy + "\r\nDirected By : " + directedBy
				+ "\r\n Duration is : " + duration + "\r\n Released Year is : " + releasedYear + "\r\nCategory : " + category;

		
	}
}
