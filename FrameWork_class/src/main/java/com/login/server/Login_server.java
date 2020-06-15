package com.login.server;

import com.login.user.User_Manage;
import com.opensymphony.xwork2.ActionSupport;
public class Login_server extends ActionSupport {
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String start() {
		User_Manage user=new User_Manage(username, password);
		System.out.println(user.toString());
		if(user.check()){
			return "success";
		}
		else{
			return "fail";
		}
	}

}
