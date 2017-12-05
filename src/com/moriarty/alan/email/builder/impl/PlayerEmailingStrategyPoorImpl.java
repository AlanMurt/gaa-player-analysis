package com.moriarty.alan.email.builder.impl;

import com.moriarty.alan.email.builder.PlayerEmailingStrategy;
import com.moriarty.alan.email.enums.QualityRatings;

public class PlayerEmailingStrategyPoorImpl implements PlayerEmailingStrategy {
	private static final String NEW_LINE = "\n";
	
	@Override
	public String getPopulatedBody() {
		StringBuilder stringBuilder = new StringBuilder(messageToAppendToBody);
		stringBuilder.append("Your performance for this month has been: " + QualityRatings.POOR.name());
		stringBuilder.append(NEW_LINE);
		stringBuilder.append("As a result of this, you will be deducted 10% of your wages for this month.");
		return stringBuilder.toString();
	}
}