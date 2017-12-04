package com.moriarty.alan.main;
import com.moriarty.alan.data.Player;
import com.moriarty.alan.data.PlayerFactory;
import com.moriarty.alan.data.Positions;
import com.moriarty.alan.data.Feet;

public class Driver {
    private static final int AGE = 22;
    private static final int HEIGHT = 180;
	private static final int WEIGHT = 73;
	private static final String CLUB = "Legion";
	private static final String NAME = "Alan";

	public static void main(String args[]){
    	PlayerFactory playerFactory = new PlayerFactory();
    	Player player = playerFactory.createPlayer();
    	setupPlayerAttributes(player);

    	System.out.println("Player ratings:");
    	for (double rating : player.getRatings())
    		System.out.println(rating);
    	System.out.println("Average rating: " + player.calculateAverageRating());
    	
        System.out.println(player.getPlayerSummary());
    }

	private static void setupPlayerAttributes(Player player) {
		player.setName(NAME);
    	player.setAge(AGE);
    	player.setClub(CLUB);
    	player.setPosition(Positions.FORWARD.getName());
    	player.setPreferredFoot(Feet.RIGHT.getName());
    	player.setHeight(HEIGHT);
    	player.setWeight(WEIGHT);
	}
}
