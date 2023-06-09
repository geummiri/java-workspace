package com.kh.stream.practice;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 스트림(Stream)
 *  - 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 것
 *  
 * 스트림의 특징
 *  - 데이터를 읽기만 할 뿐 병경하지 않는다.
 *  - Iterator처럼 일회용 (필요하면 다시 스트림 생성)
 *  - 내부 반복 처리
 *  
 * 스트림의 종류
 *  - java.util.stream 패키지에 존재하고 BaseStream 인터페이스를 부모로 해서 자식 인터페이스들이 상속 관계를 이루고 있음
 *   
 */
public class Create {

	public static void main(String[] args) {
		
		Create c = new Create();
//		c.method1();
		c.method2();
	}
	
	//숫자 범위로 스트림을 생성하는 방법
	// - IntStream, LongStream, DoubleStream의 range(),
	// rangeClosed() 메서드를 이용해서 생성
	public void method1() {
		//첫번째 매개 값 ~ 두번째 매개값 이전까지의 값을 요소로 가지는 스트림 객체를 생성
		IntStream stream = IntStream.range(1, 10);
		int sum = stream.sum();
		System.out.println("range의 sum : " + sum); //1부터 9까지 숫자 합 
		
		//첫번째 매개값 ~ 두번째 매개값까지의 값을 요소로 가지는 스트림 객체를 생성
		stream = IntStream.rangeClosed(1, 10);
		sum = stream.sum();
		System.out.println("rangeClosed의 sum :" + sum); //1부터 10까지의 숫자 합
	}
	
	/*
	 * 배열로부터 스트림을 생성하는 방법
	 * - Arrays.stream(배열) 메서드로 스트림을 생성한다.
	 * - 각 스트림(Stream, IntStream, ...)의 of(배열) 메서드로 스트림을 생성한다.
	 * 
	 * 
	 */
	public void method2() {
		
		String[] names = {"노석우", "장미르", "금미리", "김준우"};
		
		for (String name : names) {
			System.out.println(name + " ");
		}
		
		System.out.println();
		
		//스트림으로~
		Stream<String> stream = Arrays.stream(names);
		stream.forEach(name -> System.out.println(name + " "));
	}
	
	
}
