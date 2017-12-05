package com.moriarty.alan.main;
import com.moriarty.alan.data.EmailData;
import com.moriarty.alan.data.Player;
import com.moriarty.alan.data.PlayerFactory;
import com.moriarty.alan.email.builder.PlayerEmailingStrategy;
import com.moriarty.alan.email.builder.impl.PlayerEmailingContext;
import com.moriarty.alan.email.enums.EmailAddresses;
import com.moriarty.alan.email.enums.Feet;
import com.moriarty.alan.email.enums.Positions;

import java.util.ArrayList;
import java.util.List;

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
    	printPlayerRatings(player.getRatings());
    	String playerQuality = player.determineQuality();
    	double playerAverageRating = player.calculateAverageRating();
		System.out.println("Player Quality: " + playerQuality);
		System.out.println("Average rating: " + playerAverageRating);
        System.out.println("\nPlayer Summary:\n" + player.getPlayerSummary());
        
        
        PlayerEmailingContext emailingContext = new PlayerEmailingContext();
        PlayerEmailingStrategy emailingStrategy = emailingContext.determineStrategy(playerQuality);
        EmailData email = setupEmailData(player.getEmailAddress());
        emailingStrategy.sendEmail(email);
    }

	private static void printPlayerRatings(List<Double> ratings) {
		for (double rating : ratings)
    		System.out.println(rating);
	}
	
	private static EmailData setupEmailData(String playerEmailAddress) { 
		EmailData email = new EmailData(); 
		email.setFromAddress(EmailAddresses.MANAGER.getEmailAddress());
	    setEmailDataToList(email, playerEmailAddress);
	    setEmailDataCcList(email);
	    
	    return email;
	}

	private static void setEmailDataToList(EmailData email, String playerEmailAddress) {
		List<String> toList = new ArrayList<String>();
	    toList.add(playerEmailAddress);
	    email.setToList(toList);
	}
	
	private static void setEmailDataCcList(EmailData email) {
		List<String> ccList = new ArrayList<String>();
		ccList.add(EmailAddresses.COACH.getEmailAddress());
		ccList.add(EmailAddresses.ACCOUNTANT.getEmailAddress());
		email.setCcList(ccList);
	}

	private static void setupPlayerAttributes(Player player) {
		player.setName(NAME);
    	player.setAge(AGE);
    	player.setClub(CLUB);
    	player.setPosition(Positions.FORWARD.getName());
    	player.setPreferredFoot(Feet.RIGHT.getName());
    	player.setHeight(HEIGHT);
    	player.setWeight(WEIGHT);
    	player.setEmailAddress(EmailAddresses.PLAYER.getEmailAddress());
	}
}
