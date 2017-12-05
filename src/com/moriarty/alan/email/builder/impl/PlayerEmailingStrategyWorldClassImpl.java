package com.moriarty.alan.email.builder.impl;

import com.moriarty.alan.email.builder.PlayerEmailingStrategy;
import com.moriarty.alan.email.enums.QualityRatings;

public class PlayerEmailingStrategyWorldClassImpl implements PlayerEmailingStrategy {
	private static final String NEW_LINE = "\n";
	
	@Override
	public String getPopulatedBody() {
		StringBuilder stringBuilder = new StringBuilder(messageToAppendToBody);
		stringBuilder.append("Your performance for this month has been: " + QualityRatings.WORLD_CLASS.name());
		stringBuilder.append(NEW_LINE);
		stringBuilder.append("As a result of this, you will receive a 25% bonus on top of this months wages.");
		return stringBuilder.toString();
	}
}