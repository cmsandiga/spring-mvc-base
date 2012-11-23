package com.makoto.service;

public class AuthentificationServiceSimpleImpl implements AuthentificationService{

	
	public UserAuthentificationBean findUserByCredentials(String user,
			String password) {
		UserAuthentificationBean userAuthentificate=null;
		
		if(user!=null && password!=null)
			if(user.equals("admin") && password.equals("admin")){
				userAuthentificate= new UserAuthentificationBean();
				userAuthentificate.setUser("admin");
				userAuthentificate.setPassword("admin");
				return userAuthentificate;
			}
		return userAuthentificate;
	}

}
