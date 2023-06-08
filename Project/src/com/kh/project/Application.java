package com.kh.project;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.project.controller.UserController;
import com.kh.project.model.User;

public class Application {

	Scanner sc = new Scanner(System.in);
	UserController uc = new UserController();
	ArrayList<User> list = new ArrayList<User>();
	
	public static void main(String[] args) {
		
		Application app = new Application();
		app.mainMenu();
	}
	
	
	public void mainMenu() {
		System.out.println("1. 로그인하기");
		System.out.println("2. 회원가입하기");
		System.out.println("3. 계정삭제");
		
		boolean check = true;
		while(check) {
		switch(Integer.parseInt(sc.nextLine())) {
		
		case 1: 
			login();
			break;
		case 2: 
			signUp();
		case 3: 
			deleteProfile();
			break;
		case 4: 
			break;
		default : 
			check = false;
			break;
			
		}
		
	}}
	
	public void login() {
		
		System.out.print("아이디 입력 :");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력 :");
		String password = sc.nextLine();
		
		if(uc.login(id, password)) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
			login();
		}
		
	}
	//회원가입
	public void signUp() {
		System.out.print("생성할 아이디 : ");
		String id = sc.nextLine();
		System.out.print("생성할 비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		System.out.print("본인 핸드폰번호 : ");
		String phone = sc.nextLine();
		
		uc.signUp(new User(id, password, email, phone));
		System.out.println("회원 가입 성공");
		mainMenu();
	}
	
	public void deleteProfile() {
		System.out.println("삭제할 아이디 : ");
		String id = sc.nextLine();
		
		if(list.get(0).equals(id)) {
			uc.deleteProfile(id);
			System.out.println("아이디가 삭제되었습니다.");
		} 
		else {
			System.out.println("실패");
		}
		
		
		
	}
}
