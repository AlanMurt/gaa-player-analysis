package com.moriarty.alan.email.builder.impl;

import com.moriarty.alan.email.builder.PlayerEmailingStrategy;
import com.moriarty.alan.email.enums.QualityRatings;

public class PlayerEmailingContext {
	public PlayerEmailingStrategy determineStrategy(String playerQuality) {
		if (playerQuality.equals(QualityRatings.WORLD_CLASS.name()))
			return new PlayerEmailingStrategyWorldClassImpl();
		else if (playerQuality.equals(QualityRatings.GOOD.name()))
			return new PlayerEmailingStrategyGoodImpl();
		else if (playerQuality.equals(QualityRatings.AVERAGE.name()))
			return new PlayerEmailingStrategyAverageImpl();
		else if (playerQuality.equals(QualityRatings.POOR.name()))
			return new PlayerEmailingStrategyPoorImpl();
		return new PlayerEmailingStrategyAbysmalImpl();
	}
}