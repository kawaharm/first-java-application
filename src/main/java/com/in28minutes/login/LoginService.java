package com.in28minutes.login;

public class LoginService {
	
	public boolean isUservalid(String user, String password) {
		if(user.equals("sloth") && password.equals("slowpoke"))
			return true;
		
		return false;
	}

}
