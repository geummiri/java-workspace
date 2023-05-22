package com.kh.loop;

import java.util.Scanner;

class LoopPractice {
	
	Scanner sc = new Scanner(System.in);

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
    	
    	int num = 0;
    	
    	System.out.print("사용자 입력 : ");
    	num = sc.nextInt();
    	
    	for(int i=num; i>=1 ; i--) {
    		
    		if(num >= i)
    		System.out.println(i);
    	}
    }

    // 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상 되는지 출력하시오.
    public void method2() {
    	
    	int sum = 0;
    	
    		
    			for(int i=1; ;i++) {
    	
    				if(i % 2 == 0) {
    					sum -= i;
    				}
    				else if (i % 2 == 1) {
    					sum += i;
    		}
    				if(sum >= 100) {
    					System.out.println(i);
    				break;}
    	}	
    			
    }
   
    

    /*
        사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가 몇 개 있는지 개수를 출력하세요. 

        문자열 : banana
        문자 : a
        banana 안에 포함된 a 개수 : 3

    */
    public void method3() {
    	
    	String str = "";
    	char ch;

    	
    	System.out.print("문자열 : ");
    	str = sc.next();
    	
    	System.out.print("문자 : ");	
    	ch = sc.next().charAt(0);
    	
    	int count = 0;

    	for(int i=0; i<str.length();i++) {
    		if(str.charAt(i) == ch) {
    			count++;
    		}
    		
        	//break문 사용하면 결과값이 안나오고 break문 사용 안하면 답이 여러개 나와서 마지막 값만 추출하고 싶은데 방법을 모르겠습니다 ㅠ
    		//break;
    	
    	}	
    	
    	System.out.println(str + "안에 포함된 " + ch + " 개수 : " + count);

    	
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
    	

    	for(int i=1; ; i++) {
    		
        	int num = (int)(Math.random()*10);

    		if(num>=1 && num<=10) {
    		System.out.println(num);
    		}
    		
    		else if(num == 0) {
    		System.out.println(num);
    		break;}
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
    	
    	int a=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		int f=0;
    		
    	for(int i=1; i<=10 ; i++) {
    
    		int num = (int)(Math.random() * 6 + 1);
    		
    		switch(num) {
    		
    		case 1: a++; break;
    		case 2: b++; break;
    		case 3: c++; break;
    		case 4: d++; break;
    		case 5: e++; break;
    		case 6: f++; break;
    		} //10번 돌린 다음에 값 추출 
    	}
    		System.out.println("1 : " + a);
    		System.out.println("2 : " + b);
    		System.out.println("3 : " + c);
    		System.out.println("4 : " + d);
    		System.out.println("5 : " + e);
    		System.out.println("6 : " + f);
    		
    		}
    /*
        사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 
        컴퓨터가 가위인지 보인지 주먹인지는 랜덤한 수를 통해서 결정하도록 하고, 사용자에게는 직접 가위바위보를 받으세요.
        사용자가 이겼을 때 반복을 멈추고 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.


        당신의 이름을 입력해주세요 : 
        가위바위보 : 가위
        컴퓨터 : 가위
        박신우 : 가위
        비겼습니다.

        가위바위보 : 가위 
        컴퓨터 : 바위
        박신우 : 가위
        졌습니다 ㅠㅠ

        가위바위보 : 보
        컴퓨터 : 바위
        박신우 : 보
        이겼습니다 !
    */
    public void method6() {
    	
    	String name = "";
    	String a = "";
    	
    	System.out.print("당신의 이름을 입력해주세요 : ");
    	name = sc.next();
    	
    	System.out.print("가위바위보 : ");
    	a = sc.next();
    	

    	int num = (int)Math.random()* 3 +1;
    	
    	if(num == 1) {
    		System.out.println("컴퓨터 : 가위");
    	} else if (num == 2) {
    		System.out.println("컴퓨터 : 바위");
    	} else if(num == 3){
    		System.out.println("컴퓨터 : 보 ");
    	}
    	
    	System.out.println(name + " : " + a);
    	
    	int count1 = 0;
    	int count2 = 0;
    	int count3 = 0;
    	
    	for(int i=1; ; i++) {
    		
    		if(num == 1) {
    		
    		 if("가위".equals(a)) {
    			System.out.println("비겼습니다.");
    			System.out.println();
    	    	
    	    	System.out.print("가위바위보 : ");
    	    	a = sc.next();
    	    	
    	    	if(num == 1) {
    	    		System.out.println("컴퓨터 : 가위");
    	    	} else if (num == 2) {
    	    		System.out.println("컴퓨터 : 바위");
    	    	} else if(num == 3){
    	    		System.out.println("컴퓨터 : 보 ");
    	    	}
    	    	count1++;
    	    	System.out.println(name + " : " + a);
    	    	
    		}
    		else if("보".equals(a)) {
    			System.out.println("졌습니다.");
    			System.out.println();
    	    	
    	    	System.out.print("가위바위보 : ");
    	    	a = sc.next();
    	    	
    	    	if(num == 1) {
    	    		System.out.println("컴퓨터 : 가위");
    	    	} else if (num == 2) {
    	    		System.out.println("컴퓨터 : 바위");
    	    	} else if(num == 3){
    	    		System.out.println("컴퓨터 : 보 ");
    	    	}
    	    	count2++;
    	    	System.out.println(name + " : " + a);
    	    	
    	    	
    		}
    		else if("바위".equals(a)) {
    			count3++;
    			System.out.println("이겼습니다.");
    			System.out.println(count1 +"번 비기고, " + count2 + "번 졌고, " + count3 + "번 이겼습니다.");

    			break;
    		}
    		 
    		 if(num == 2) {
    	    		
        		 if("바위".equals(a)) {
        			System.out.println("비겼습니다.");
        			System.out.println();
        	    	
        	    	System.out.print("가위바위보 : ");
        	    	a = sc.next();
        	    	
        	    	if(num == 1) {
        	    		System.out.println("컴퓨터 : 가위");
        	    	} else if (num == 2) {
        	    		System.out.println("컴퓨터 : 바위");
        	    	} else if(num == 3){
        	    		System.out.println("컴퓨터 : 보 ");
        	    	}
        	    	count1++;
        	    	System.out.println(name + " : " + a);
        	    	
        		}
        		else if("가위".equals(a)) {
        			System.out.println("졌습니다.");
        			System.out.println();
        	    	
        	    	System.out.print("가위바위보 : ");
        	    	a = sc.next();
        	    	
        	    	if(num == 1) {
        	    		System.out.println("컴퓨터 : 가위");
        	    	} else if (num == 2) {
        	    		System.out.println("컴퓨터 : 바위");
        	    	} else if(num == 3){
        	    		System.out.println("컴퓨터 : 보 ");
        	    	}
        	    	count2++;
        	    	System.out.println(name + " : " + a);
        	    	
        		}
        		else if("보".equals(a)) {
        			count3++;
        			System.out.println("이겼습니다.");
        			System.out.println(count1 +"번 비기고, " + count2 + "번 졌고, " + count3 + "번 이겼습니다.");

        			break;
        		}
        		 
        	 if(num == 3) {
     	    		
            		 if("보".equals(a)) {
            			System.out.println("비겼습니다.");
            			System.out.println();
            	    	
            	    	System.out.print("가위바위보 : ");
            	    	a = sc.next();
            	    	
            	    	if(num == 1) {
            	    		System.out.println("컴퓨터 : 가위");
            	    	} else if (num == 2) {
            	    		System.out.println("컴퓨터 : 바위");
            	    	} else if(num == 3){
            	    		System.out.println("컴퓨터 : 보 ");
            	    	}
            	    	count1++;
            	    	System.out.println(name + " : " + a);
            	    	
            		}
            		else if("바위".equals(a)) {
            			System.out.println("졌습니다.");
            			
            			System.out.println();
            			
            	    	System.out.print("가위바위보 : ");
            	    	a = sc.next();
            	    	
            	    	if(num == 1) {
            	    		System.out.println("컴퓨터 : 가위");
            	    	} else if (num == 2) {
            	    		System.out.println("컴퓨터 : 바위");
            	    	} else if(num == 3){
            	    		System.out.println("컴퓨터 : 보 ");
            	    	}
            	    	count2++;
            	    	
            	    	System.out.println(name + " : " + a);
            	    	
            		}
            		else if("가위".equals(a)) {
            			count3++;
            			System.out.println("이겼습니다.");
            			System.out.println(count1 +"번 비기고, " + count2 + "번 졌고, " + count3 + "번 이겼습니다.");
            			break; 
            		}
        	 	}
    		 }
    		}
    	}
    }
    	
   
    		
    	
	public static void main(String[] args) {
	  LoopPractice l = new LoopPractice();
	  
//	  l.method1();
//	  l.method2();
	  l.method3();
//	  l.method4();
//	  l.method5();
//	  l.method6();
}
}