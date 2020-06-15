package com.login.user;

public class User_Manage {
	private String name;
	private String password;
	
	public User_Manage(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User_Manage [name=" + name + ", password=" + password + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean check() {
		if(this.name.equalsIgnoreCase("ÕÅÈý")&&this.password.equalsIgnoreCase("123456")) {
			return true;
		}else {
			return false;
		}
	}
}
