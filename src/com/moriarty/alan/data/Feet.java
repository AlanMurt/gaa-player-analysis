package com.moriarty.alan.data;

public enum Feet {
	LEFT("Left"), RIGHT("Right");
	
	private String prefferedFoot;
	
	private Feet(String prefferedFoot) {
		this.prefferedFoot = prefferedFoot;
	}
	
	public String getName() {
		return prefferedFoot;
	}
}
