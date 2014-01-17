package coupon.dto;

import org.seasar.mai.mail.MailAddress;

public class MailAccountConfirmDto {
	public MailAddress[] to;
	public MailAddress[] cc;
	public MailAddress[] bcc;
	public String name;
	public String accountConfirmUrl;

	public MailAddress[] getTo() {
		return to;
	}

	public void setTo(MailAddress[] to) {
		this.to = to;
	}

	public MailAddress[] getCc() {
		return cc;
	}

	public void setCc(MailAddress[] cc) {
		this.cc = cc;
	}

	public MailAddress[] getBcc() {
		return bcc;
	}

	public void setBcc(MailAddress[] bcc) {
		this.bcc = bcc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountConfirmUrl() {
		return accountConfirmUrl;
	}

	public void setAccountConfirmUrl(String accountConfirmUrl) {
		this.accountConfirmUrl = accountConfirmUrl;
	}

}