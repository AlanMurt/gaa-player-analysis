package com.moriarty.alan.email.enums;

public enum QualityRatings {
	WORLD_CLASS(8.0), GOOD(6.0), AVERAGE(4.0), POOR(2.0), ABYSMAL(0.0);
	
	private double minimumAverageRating;

	private QualityRatings(double minimumAverageRating) {
		this.minimumAverageRating = minimumAverageRating;
	}
	
	public double getMinimumAverageRating() {
		return minimumAverageRating;
	}
}