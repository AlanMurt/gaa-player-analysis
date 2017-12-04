package com.moriarty.alan.data;

public enum Positions {
	FORWARD("Forward"), MIDFIELDER("Midfielder"), DEFENDER("Defender"), GOALKEEPER("Goalkeeper");

	private String prefferedPosition;
	
	private Positions(String prefferedPositon) {
		this.prefferedPosition = prefferedPositon;
	}
	
	public String getName() {
		return prefferedPosition;
	}
}
