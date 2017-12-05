package com.moriarty.alan.email.builder.impl;

import com.moriarty.alan.email.builder.PlayerEmailingStrategy;
import com.moriarty.alan.email.enums.QualityRatings;

public class PlayerEmailingStrategyAverageImpl implements PlayerEmailingStrategy {
	private static final String NEW_LINE = "\n";
	
	@Override
	public String getPopulatedBody() {
		StringBuilder stringBuilder = new StringBuilder(messageToAppendToBody);
		stringBuilder.append("Your performance for this month has been: " + QualityRatings.AVERAGE.name());
		stringBuilder.append(NEW_LINE);
		stringBuilder.append("As a result of this, you will not be deducted any of your wages for this month. On the other hand, you will not receive any bonuses either");
		return stringBuilder.toString();
	}
}