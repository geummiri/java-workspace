package com.kh.loop;

import java.util.Arrays;
import java.util.Scanner;

public class Loop {
	
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Loop l = new Loop();
//		l.method1();
//		l.method2();
//		l.method3();
//		l.method4();
		l.method5();
	}
	/*
    사용자로부터 숫자(1~100) 1개가 입력되었을 때 카운트다운 출력하시오.
    사용자 입력 : 5
    5
    4
    3
    2
    1
 */
	public void method1() {
		
		//사용자가 입력할 값 스캐너에 넣기
		System.out.println("숫자를 입력하세요. >> ");
		
		int num = sc.nextInt();
		
//		int sum = 0;
		for(int i=num; i>0; i--) {
			System.out.println(i);
		}
	}
	
    // 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때
	//몇까지 더해야 총합이 100 이상 되는지 출력하시오.
	public void method2() {
		
		//if문 사용해서 100이상이되면 값 나오게끔 출력 
		
		//홀수는 양수 짝수는 음수
		int sum = 0;
		int num = 1;
		
		while(sum < 100) {
			
				if(num % 2 == 0) {
					sum -= num;
					}
				else {
					sum += num;
					}
				
					num++;
			}
		System.out.println(num-1);
	}
    /*
    사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가 몇 개 있는지 개수를 출력하세요. 

    문자열 : banana
    문자 : a
    banana 안에 포함된 a 개수 : 3
*/
	public void method3() {
		
		//사용자한테 입력받아야 하니까 스캐너출력
		System.out.print("문자열 : ");
		String str = sc.nextLine();
//		String arr[] = new String[str.length()];
		
		int count = 0;
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(str + "안에 포함된 " + ch + " 의 개수 : " + count);
	}
	
	/*
    0이 나올 때까지 숫자를 출력하시오. (random 사용! 1~10)
    7
    3
    4
    2
    3
    4
    0
 */
	public void method4() {
		
		
		for(int i=1; i>=0; i++) {
			
			int random = (int)(Math.random() * 11);

			if(random >=1 && random <= 10) {
				System.out.println(random);
			}
			else if(random == 0){
				System.out.println(random);
				break;
			}
		}
		
		
	}
	/*
    주사위를 10번 굴렸을 때 각 눈의 수가 몇 번 나왔는지 출력하세요. (random 사용!)

    1 : 3
    2 : 2
    3 : 1
    4 : 0
    5 : 4
    6 : 0

 */
	public void method5() {
		
		//for문 두개 만들기
		//한개는 count 앞에 10번 굴리는거 카운트하고
		//다른 하나는 주사위 랜덤값 1~6까지의 숫자를 마구잡이로 돌리기 
		//1~6 총 6번의 주사위를 돌릴거고, 1번 돌릴때 주사위는 1번(1~6사이의 숫자로 돌려짐)
		
		//배열 사용하기 배열 사용해야지 간결한 코드 가넝
		
		int arr[] = new int[6];
		
		for(int i=1; i<=10; i++) {
			int num = (int)(Math.random()*6) +1;
			arr[num -1]++;
			System.out.println(Arrays.toString(arr));
		}
		
//		int random = (int)(Math.random() * 6) +1;
//		int count = 0;
//		for(int i=1; i<11; i++) {
//			count++;
//			System.out.println(count + " : ");
//			}
//			
//		for(int i=1; i<7; i++) {
//			System.out.println(random);
//		}
		
	}
		
	}
