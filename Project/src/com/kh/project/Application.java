package com.kh.project;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.project.controller.FoodController;
import com.kh.project.controller.UserController;
import com.kh.project.model.Food;
import com.kh.project.model.User;


	public class Application {
	
		Scanner sc = new Scanner(System.in);
		UserController uc = new UserController();
		ArrayList<User> list = new ArrayList<User>();
		FoodController fc = new FoodController();
		Food f = new Food();
		
		public static void main(String[] args) {
			
			Application app = new Application();
			app.mainMenu();
		}
		//메인메뉴
		public void mainMenu() {
			System.out.println("===========kh음식주문=============");
			System.out.println("1. 직원 메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			System.out.println();
			boolean check = true;
			while(check) {
			switch(Integer.parseInt(sc.nextLine())) {
			
			case 1: 
				adminMenu();
				break;
			case 2: 
				userMenu();
			case 9:
				System.out.println("종료");
				check = false;
				break;
			default : 
				check = false;
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				mainMenu();
				
			}
			
		}}
		
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
		//로그인하기
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
		//계정 삭제하기 
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
		
	//관리자 메뉴
	public void adminMenu() {

		System.out.println("****** 직원 메뉴 ******");
		System.out.println("1. 새로운 메뉴 추가");
		System.out.println("2. 메뉴 삭제");
		System.out.println("3. 수량 수정");
		System.out.println("4. 메뉴 목록");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 선택 : ");
		switch(Integer.parseInt(sc.nextLine())) {
		case 1:
			addNewKind();
			mainMenu();
		case 2:
			removeKind();
			mainMenu();
		case 3:
			changeAmount();
			mainMenu();
		case 4:
			printFood();
			mainMenu();
		case 9:
			mainMenu();
			break;
		}
		
	}
	
	//새로운 음식 종류 추가
	public void addNewKind() {
		
		try {
			
		System.out.println("1. 중식 / 2. 한식 / 3. 일식 ");
		System.out.print("추가할 종류 번호 : ");
		int select = Integer.parseInt(sc.nextLine());
		System.out.print("추가할 이름 : ");
		String name = sc.nextLine();
		System.out.print("추가할 수량 : ");
		int amount = Integer.parseInt(sc.nextLine());
		
		String check = null;
		
		if(select == 1) {
			check = "중식";
		} else if (select == 2) {
			check = "한식";
		} else if (select == 3) {
			check = "일식";
		}
		
		
		Food f = new Food();
		f.setName(name);
		f.setKind(check);
		
		//select kind로 바꾸는법
		
		boolean result = fc.addNewKind(f, amount);
		
		if(result) {
			System.out.println("새로운 음식이 추가되었습니다.");
			
		} else {
			System.out.println("새로운 음식 추가에 실패하였습니다. 다시 입력해주세요.");
		}
		
		} 
		
		catch (Exception e) {
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요" );
			addNewKind();
		}
	}

	//기존 음식 삭제
	public void removeKind() {
		
		try {
		System.out.println("1. 중식 / 2. 한식 / 3. 일식 ");
		System.out.print("삭제할 종류 번호 : ");
		int select = Integer.parseInt(sc.nextLine());
		System.out.print("삭제할 이름 : ");
		String name = sc.nextLine();
		
		String check = null;
		
		if(select == 1) {
			check = "중식";
		} else if (select == 2) {
			check = "한식";
		} else if (select == 3) {
			check = "일식";
		}
		
		Food f = new Food();
		f.setName(name);
		f.setKind(check);
		boolean result = fc.removeKind(f);
		
		if(result) {
			System.out.println("메뉴 삭제에 성공하였습니다.");
		} 
			else {
				System.out.println("메뉴 삭제에 실패하였습니다. 다시 입력해주세요.");
		}
		
		} 
			catch(Exception e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				removeKind();
		}
	}
	
	//기존 음식 메뉴 수량 변경
	public void changeAmount() {
				
		try {
		System.out.println("1. 중식 / 2. 한식 / 3. 일식 ");
		System.out.print("수정할 종류 번호 : ");
		int select = Integer.parseInt(sc.nextLine());
		System.out.print("수정할 이름 : ");
		String name = sc.nextLine();
		System.out.print("수정할 수량 : ");
		int amount = Integer.parseInt(sc.nextLine());
		
		String check = null;
		
		if(select == 1) {
			check = "중식";
		} else if (select == 2) {
			check = "한식";
		} else if (select == 3) {
			check = "일식";
		}
		
		Food f = new Food();
		f.setName(name);
		f.setKind(check);
		
		boolean result = fc.changeAmount(f, amount);
		
		if(result) {
			System.out.println("메뉴 수량이 수정되었습니다.");
		} 
		else {
			System.out.println("메뉴 수량 수정에 실패하였습니다. 다시 입력해주세요.");
		}
		}
		catch (Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			changeAmount();
		}
	}

	
	
	//사용자 메뉴
	public void userMenu(){
		System.out.println("1. 메뉴보기");
		System.out.println("2. 주문하기");
		System.out.println("3. 주문내역보기");
		System.out.println("4. 주문취소하기");
		
		boolean check = true;
		while(check) {
		switch(Integer.parseInt(sc.nextLine())) {
		
		case 1:
			printFood();
			userMenu();
			
		case 2: 
			buyFood();
			userMenu();
		case 3: 
			printBuyFood();
			userMenu();
			
		case 4: 
			removeFood();
			userMenu();
			
		default : 
			check = false;
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			userMenu();
			break;
			
			}
		}
		
	}
	
	
	//============================고객 관련 기능============================================
	
	//기존 음식메뉴 결과값 추출
		public void printFood() {
			System.out.println(fc.printFood());
		}
	
	//음식 주문하기
	public void buyFood() {
		
	System.out.println("1. 중식 / 2. 한식 / 3. 일식 ");
	System.out.print("구매 종류 번호 : ");
	int select = Integer.parseInt(sc.nextLine());
	System.out.print("구매할 메뉴 : ");
	String name = sc.nextLine();
	System.out.print("구매할 개수 : ");
	int num = Integer.parseInt(sc.nextLine());
	
	String check = null;
	
	if(select == 1) {
		check = "중식";
	} else if (select == 2) {
		check = "한식";
	} else if (select == 3) {
		check = "일식";
	}

	Food f = new Food();
	f.setName(name);
	f.setKind(check);
	
	boolean result = fc.buyFood(f, num);

	if(result) {
		System.out.println("주문이 완료되었습니다. 맛있게 드세요!");
	} 
	else {
		System.out.println("해당 상품은 없는 상품이거나 수량이 없습니다. 다시 입력해주세요.");
	}
	}
	
	//음식 주문 취소하기
	public void removeFood() {
		
		System.out.println("1. 중식 / 2. 한식 / 3. 일식 ");
		System.out.print("취소 종류 번호 : ");
		int select = Integer.parseInt(sc.nextLine());
		System.out.print("구매 취소할 메뉴 : ");
		String name = sc.nextLine();
		System.out.print("취소할 개수 : ");
		int cancelNum =Integer.parseInt(sc.nextLine());
		
		String kind = null;
		switch (select) {

		case 1:
			kind = "중식";
			break;

		case 2:
			kind = "한식";
			break;

		case 3:
			kind = "일식";
			break;
		}
		
		Food f = new Food();

		f.setKind(kind);
		f.setName(name);

		if (fc.removeFood(f, cancelNum) == true) {
			System.out.println("구매 취소에 성공하였습니다.");
		} else
			System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요.");
	}
		
	//내가 구매한 내역
	public void printBuyFood() {
		
		System.out.println("현재 주문한 메뉴 내역은 : \n" + fc.buyFoodList());
	}
	
}
	
