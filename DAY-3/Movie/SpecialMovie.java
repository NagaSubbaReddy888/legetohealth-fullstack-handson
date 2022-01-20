package com.org;

public class SpecialMovie extends Movie{

	private String soundEffects;
	private String visualEffects;

	public SpecialMovie(String movieName, String producedBy, String directedBy, int duration, int releasedYear,
			String category, String soundEffects, String visualEffects) {
		super(movieName, producedBy, directedBy, duration, releasedYear, category);
		this.soundEffects = soundEffects;
		this.visualEffects = visualEffects;
	}

	public SpecialMovie(String name, String producedBy, String directedBy, int duration, int year, String category) {
		super(name, producedBy, directedBy, duration, year, category);
	
	}
	public SpecialMovie(String name, String producedBy) {
		super(name, producedBy);
	}

	public String getSoundEffects() {
		return soundEffects;
	}

	public String getVisualEffects() {
		return visualEffects;
	}

	public void setSoundEffects(String soundEffects) {
		this.soundEffects = soundEffects;
	}

	public void setVisualEffects(String visualEffects) {
		this.visualEffects = visualEffects;
	}

	public void showInSpecialMovie() {
		super.showDetails();
	}
}
