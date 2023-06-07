package com.kh.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Application {
//로또 추출
//로또 언제 끝나는지 횟수
//0~45까지 숫자 사용해서 로또 번호 맞출때까지 돌리기
//TreeSet 사용해서 숫자 오름차순
	//for문
	public static void main(String[] args) {
		
		Application app = new Application();
//		app.method1();
		app.method2();

	}
	
	public void method1() {
		TreeSet<Integer> lotto = new TreeSet<>();

		for(int i=0; lotto.size()<6; i++) {
			int num = (int)(Math.random() * 45 + 1);
			lotto.add(num);
				}
			
		
//			//내 번호는 반복문 안에 반복문
			int count= 0;
			while(true) {

				
				TreeSet<Integer> myLotto = new TreeSet<>();
				while(myLotto.size()<6) {
					
					int choose = (int)(Math.random() * 45 + 1);
					myLotto.add(choose);
					
				}
			}
	}
//					
//				}
//				System.out.println("로또 번호 : " + lotto);
//				System.out.println("내 번호 : " + myLotto);
//				count++;
//			
//				
//				if(lotto.equals(myLotto)) {
//					System.out.println("횟수 :" + count);
//				}
//			}
//				
//		ex3)	for(int i=0; myLotto.size()<6; i++) {
//					int num = (int)(Math.random() * 45 + 1);
//					myLotto.add(num);
//					
//				}
//				count ++;
//				System.out.println("내 번호 : " + myLotto);
//				if(lotto.equals(myLotto)) {
//						
//						System.out.println("횟수 :" + count);
//						break;
//					}
//				
//				
//				}

			
			
			
	
	public void method2() {
		//Set 안쓰고 ArrayList 사용하는 방법
		
		HashSet<Integer> lotto = new HashSet<>();

		for(int i=0; lotto.size()<6; i++) {
			int num = (int)(Math.random() * 45 + 1);
			lotto.add(num);
				}
			
		
		List lottoList = new ArrayList(lotto); 
		Collections.sort(lottoList);
		
		int count= 0;
		
		while(true) {

			HashSet<Integer> myLotto = new HashSet<>();
			
			while(myLotto.size()<6) {
				
				int choose = (int)(Math.random() * 45 + 1);
				myLotto.add(choose);
			}
				
				List myLottoList = new ArrayList(myLotto);
				Collections.sort(myLottoList);
				
				System.out.println("로또 번호 : " + lottoList);
				System.out.println("내 번호 : " + myLottoList);
				count++;
				
				
				if(lottoList.equals(myLottoList)) {
					System.out.println("횟수 : " + count);		
					break;
				}
	
	
}
	}
}
