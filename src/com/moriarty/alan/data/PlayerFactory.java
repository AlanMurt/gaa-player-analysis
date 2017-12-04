package com.moriarty.alan.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayerFactory {
	private static final Random RANDOM = new Random();
	private static final double LOWER_BOUNDARY = 0.0;
	private static final double UPPER_BOUNDARY = 10.0;
	
	private Player player;

	public Player createPlayer() {
		player = new Player();
		player.setRatings(generateRandomRatings());
		
		return player;
	}
	
	private List<Double> generateRandomRatings() {
		List<Double> ratings = new ArrayList<Double>();
		for (int i=0; i<10; i++) 
			ratings.add(getRandomDoubleBetween0And10());
		return ratings;
	}

	private double getRandomDoubleBetween0And10() {
		return LOWER_BOUNDARY + (UPPER_BOUNDARY - LOWER_BOUNDARY) * RANDOM.nextDouble();
	}
}