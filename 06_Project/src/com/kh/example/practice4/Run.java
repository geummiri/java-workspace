package com.kh.example.practice4;

import java.util.Scanner;

import com.kh.example.practice4.controller.SnackController;
import com.kh.example.practice4.model.Snack;

public class Run {

	public static void main(String[] args) { //static 메소드에 사용 안되는것: 인스턴스 변수, 인스턴스 메소드
		
		Scanner sc = new Scanner(System.in);

		SnackController scr = new SnackController();

//		Snack sn = new Snack();
		
		
		System.out.println("스낵류를 입력하세요");
		
		System.out.print("종류 : ");
		String kind = sc.nextLine();
//		sn.setKind(kind);
//		sn.setKind(sc.nextLine());
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
//		sn.setName(name);
		
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
//		sn.setFlavor(flavor);
		
		System.out.print("개수 : ");
		int numOf = Integer.parseInt(sc.nextLine());
//		sn.setNumOf(numOf);
		
		System.out.print("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
//		sn.setPrice(price);
		
		Snack s = new Snack(kind, name, flavor, numOf, price);
		
		if (scr.saveData(s)) {
			System.out.println("저장이 완료되었습니다.");
			System.out.println(scr.confirmData());
		
			
			
//		System.out.println("저장 완료되었습니다.");
//		
//		System.out.print(kind + " (" + name + " - " + flavor + ") " + numOf + "개 " + price + "원");
	}

	}
}
