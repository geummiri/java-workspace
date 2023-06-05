package com.kh.list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class B_Other {

	public static void main(String[] args) {
		
		B_Other b = new B_Other();
		
//		b.method1();
//		b.method2();
		b.method3();
		

	}
	
	//Vector 이거 잘 안씀 안해도댕!
	//동기화된 (synchronized) 메서드로 구성
	public void method1() {
		
		Vector v = new Vector();
		v.add(0);
		v.add(1);
		
		v.trimToSize(); //공간을 크기에 변경
		v.add(3);
		v.add(4);
		v.ensureCapacity(5); //capacity 0~4까지 있으니까 8 나옴
		v.setSize(10); //size --> 10
		
//		v.clear(); //공간 없어졌으나 그대로 16
//		v.trimToSize(); //16 --> 0으로 바뀜
		
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity " + v.capacity());
		//벡터가 어느정도의 값을 가지고있는지 (공간의 크기 기본값이 10임)--> 10 / new Vector()에 값 넣으면 해당 값으로 capacity 값 추출
		
	}
		//스택(Stack) : 마지막에 저장한 것을 제일 먼저 꺼내는 LIFO(Last In First Out)구조
		public void method2() {
			
			Stack s = new Stack();
			s.push(0);
			s.push(1);
			s.push(2);
			s.push(3);
			s.pop(); //3 빠져나감 pop할때마다 마지막 자료를 out --> 0,1,2
			s.push(4);
			s.pop(); //4 빠져나감
			s.push(5);
			s.push(6);
			s.push(7);
			s.pop(); //7 빠져나감

			System.out.println(s);
		}
		//큐는 인터페이스, 스택은 클래스임
		//큐(Queue) : 처음에 저장한 것을 제일 먼저꺼내는 FIFO(First In First Out) 구조
		public void method3() {
			Queue q = new LinkedList();
			
			q.offer(0);
			q.offer(1);
			q.offer(2);
			q.offer(3);
			q.poll(); //0이 빠져나감
			q.add(4);
			q.remove(); //1이 빠져나감
			q.add(5);
			q.add(6);
			q.add(7);
			q.remove(); //2가 빠져나감
			System.out.println(q);
			
		}
}
