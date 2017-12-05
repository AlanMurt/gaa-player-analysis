package com.moriarty.alan.email.builder;

import java.util.List;

import com.moriarty.alan.data.EmailData;

public interface PlayerEmailingStrategy {
	String messageToAppendToBody = "";
	
	String getPopulatedBody();

	public default void sendEmail(EmailData email) {
		String emailBody = email.getBody() + getPopulatedBody();
		email.setBody(emailBody);
		printEmail(email);
	}
	
	public default void printEmail(EmailData email) {
		System.out.println("To address list:");
		printAddressList(email.getToList());
		System.out.println("\nCc address list:");
		printAddressList(email.getCcList());
		System.out.println("\nSubject:");
		System.out.println(email.getSubject());
		System.out.println("\nBody");
		System.out.println(email.getBody());
	}
	
	static void printAddressList(List<String> addressList) {
		for (String address : addressList)
			System.out.println(address);
	}
}
