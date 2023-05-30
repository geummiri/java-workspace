package practice;

import java.util.Arrays;

public class Ex1 {

	//30명중 2명 제출 안함
	//숙자 중복없이
	//작은 숫자가 첫번째줄
	//큰 숫자가 두번째줄
	public static void main(String[] args) {
		
		int[] student = new int[28];	
	
	for(int i=1; i<=student.length; i++) {
		
		student[i] = (int)(Math.random() * 28)+1;
		
		for(int j=1; j<=i; j++) {
			
			if(student[i] == student[j]) {
				i--;
				break;
			}
		}
		System.out.println(Arrays.toString(student));
		
	}
		
	}
	
}
//}for(int i=0; i<lotto.length; i++) {
//	
//	lotto[i] = (int)(Math.random() * 45) + 1;
//	
//	for(int j=0; j<i; j++) {
//		if(lotto[i] == lotto[j]) 
//			i--; //왜지
//			break;
//	}
//	}
//	return Arrays.toString(lotto);
