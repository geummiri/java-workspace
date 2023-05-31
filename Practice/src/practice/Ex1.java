package practice;

import java.util.Arrays;

import java.util.Scanner;

public class Ex1 {

	//30명중 2명 제출 안함
	//입력 1~30까지 2,8빼고 작성하면
	//출력 첫째줄에 젤 작은숫자 2
	//두째줄에 젤 큰숫자 8
	//숫자 중복없이
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	
//
//	
//	int[] student = new int[28];
//	int[] student1 = new int[30];
//
//	
//	for(int i=0; i<student.length; i++) {
//		
//		student[i] = Integer.parseInt(sc.nextLine());
//		
//		
//		}
//		
//	}
//}

	int[] student = new int[30];
	int[] student1 = new int[28];
	
	for(int i=0; i<student.length; i++) {
		
		student[i] = i+1; //1부터 30까지 출
		
	}
	
	for(int i=0; i<student1.length; i++) {
		
		student1[i] = sc.nextInt(); 
	}
		
	for(int i=0; i<student.length; i++) {
		
		for(int j=0; j<student1.length; j++) {
			
			if(student[i] == student1[j]) {
					student[i] = 0;
			}
			
	}
	}
	
	for(int i=0; i<30; i++ ) {
		if(student[i] != 0) {
		System.out.println(student[i]);
	}
		
}
}
}
	
//	int[] student = new int[31];
//	
//	for(int i=1; i<29; i++) {
//		int sucess = sc.nextInt();
//		student[sucess] = 1;
//	}
//	
//	for(int i=1; i<student.length; i++) {
//		if(student[i] != 1) {
//			System.out.println(i);
//		}
//	}
//}
//}
