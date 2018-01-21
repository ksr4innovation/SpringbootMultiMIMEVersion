package com.snkit.multimimeversion;

public class User {

	
	private String name;
	
	private String desg;
	
	private String compName;
	
	
	

	public User(String name, String desg) {
		super();
		this.name = name;
		this.desg = desg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}
	
	
}
