package com.org;

public class MovieList {
	public static void main(String[] args) {
		Movie m1 = new Movie("Pushpa", "Sukumar", "Allu Aravind", 2, 2021, "Action");
		Movie m2 = new Movie("Julayi", "Trivikram", "Ra", 1, 2,"Comedy/Action");
		Movie m3 = new Movie("Titanic", "ABC", "XYZ", 4, 2000,"Drama/comedy");

		
		System.out.println(m1.showDetails());
		
		System.out.println(m2.showDetails());
		
		System.out.println(m3.showDetails());
		
	}

}



