package com.youtube.controller;

import com.youtube.model.User;

public interface UserControllerImpl {
	
	public boolean login();
	public boolean signup();
	public User viewProfile(); 
	public User updateProfile(); 
	public boolean deleteProfile(); 

}
	
	
