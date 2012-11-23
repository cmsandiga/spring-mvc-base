package com.makoto.service;

public interface AuthentificationService {
	public UserAuthentificationBean findUserByCredentials(String user,String Password);	
}
