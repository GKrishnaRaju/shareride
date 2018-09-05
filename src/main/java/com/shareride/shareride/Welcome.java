package com.shareride.shareride;

public class Welcome {
	public Welcome(String message) {
		super();
		this.message = message;
	}

	private final String message;
	private int id;
	private String name;

	public String getMessage() {
		return message;
	}
}