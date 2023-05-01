package com.bits.ss.dto;

public class NotificationRequest {

	private String toEmail;
	private String fromEmail;
	private String receiverNumber;
	private String emailBody;
	private String emailSubject;
	private String phoneMsgBody;

	public String getToEmail() {
		return toEmail;
	}

	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}

	public String getFromEmail() {
		return fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public String getReceiverNumber() {
		return receiverNumber;
	}

	public void setReceiverNumber(String receiverNumber) {
		this.receiverNumber = receiverNumber;
	}

	public String getEmailBody() {
		return emailBody;
	}

	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public String getPhoneMsgBody() {
		return phoneMsgBody;
	}

	public void setPhoneMsgBody(String phoneMsgBody) {
		this.phoneMsgBody = phoneMsgBody;
	}

}
