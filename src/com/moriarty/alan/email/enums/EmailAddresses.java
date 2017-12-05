package com.moriarty.alan.email.enums;

public enum EmailAddresses {
	MANAGER("manager@mail.com"), COACH("coach@mail.com"), 
	ACCOUNTANT("accountant@mail.com"), PLAYER("player@mail.com");
	
	private String emailAddress;
	
	private EmailAddresses(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
}