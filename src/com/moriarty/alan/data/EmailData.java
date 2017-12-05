package com.moriarty.alan.data;

import java.util.List;

public class EmailData {
	private List<String> toList;
	private List<String> ccList;
	private String fromAddress;
	private static final String SUBJECT = "Montly Review & Payment";
	private String body = "Following is your monthly review from the manager and coach, along with bonuses/deductions based on your performance:\n";

	public List<String> getToList() {
		return toList;
	}

	public void setToList(List<String> toList) {
		this.toList = toList;
	}

	public List<String> getCcList() {
		return ccList;
	}

	public void setCcList(List<String> ccList) {
		this.ccList = ccList;
	}
	
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}
	
	public String getFromAddress() {
		return fromAddress;
	}
	
	public String getSubject() {
		return SUBJECT;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}