package com.shareride.shareride;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SignUpPojo {
	@Id
	@GeneratedValue
	private long signupID;
	private String email;
	private String psw;
	private String pswrepeat;
	public SignUpPojo(String email, String psw, String pswrepeat) {
		super();
		this.email = email;
		this.psw = psw;
		this.pswrepeat = pswrepeat;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getPswrepeat() {
		return pswrepeat;
	}
	public void setPswrepeat(String pswrepeat) {
		this.pswrepeat = pswrepeat;
	}
	
	
	
	
	
	
}
