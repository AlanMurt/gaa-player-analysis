package com.moriarty.alan.data;

import java.util.ArrayList;
import java.util.List;

import com.moriarty.alan.email.enums.QualityRatings;

public class Player {
	private int age;
	private int height;
	private int weight;
	private String club;
	private String emailAddress;
	private String name;
	private String position;
	private String preferredFoot;
	private List<Double> ratings = new ArrayList<Double>();

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPreferredFoot() {
		return preferredFoot;
	}

	public void setPreferredFoot(String preferredFoot) {
		this.preferredFoot = preferredFoot;
	}

	public List<Double> getRatings() {
		return ratings;
	}

	public void setRatings(List<Double> ratings) {
		this.ratings = ratings;
	}

	public double calculateAverageRating() {
		return getTotalRating() / ratings.size();
	}
	
	private double getTotalRating() {
		double ratingTotal = 0.0;
		for (double rating : ratings)
			ratingTotal += rating;
		return ratingTotal;
	}
	
	public String determineQuality() {
		double averageRating = calculateAverageRating();
    	if (averageRating >= QualityRatings.WORLD_CLASS.getMinimumAverageRating())
    		return QualityRatings.WORLD_CLASS.name();
    	if (averageRating >= QualityRatings.GOOD.getMinimumAverageRating())
    		return QualityRatings.GOOD.name();
    	if (averageRating >= QualityRatings.AVERAGE.getMinimumAverageRating())
    		return QualityRatings.AVERAGE.name();
		return QualityRatings.ABYSMAL.name();
	}

	public String getPlayerSummary() {
		return "Name: " + name + 
				"\nAge: " + age + 
				"\nClub: " + club + 
				"\nPosition " + position + 
				"\nPreferred Foot: " + preferredFoot + 
				"\nHeight: " + height + 
				"\nWeight: " + weight + 
				"\nAverage Rating: " + calculateAverageRating();
	}
}