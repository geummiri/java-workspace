package com.kh.project.controller;

import java.util.ArrayList;

import com.kh.project.model.User;

public class UserController {

	ArrayList<User> list = new ArrayList<>();

	public boolean login(String id, String password) { // 로그인

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id) && list.get(i).getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public void signUp(User user) { // 회원가입
		list.add(user);
	}

	public void deleteProfile(String id) { // 계정 삭제
		if (list.get(0).getId().equals(id)) {
			list.remove(0);
		}

	}
}
