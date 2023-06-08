package com.kh.map;

import java.util.Enumeration;
import java.util.Properties;

/*
 * properties
 * - HashMap 구버전인 Hashtable(Object, Object)을 상속받아 구현한 것
 * - Properties는 (String, String) 형태로 단순한 컬렉션 클래스
 * - 주로 환경설정과 관련된 속성(property)를 저장하는데 사용
 */
public class B_Properties {
	
	public  static void main(String args []) {
		
		B_Properties b = new B_Properties();
//		b.method1();
		b.method2();
	}
	
	public void method1() {
		Properties prop = System.getProperties();
		
		//prop에 저장된 요소들을 Enumeration을 이용해서 출력
		//컬랙션 프레임워크 이전 구버전이므로 Iterator가 아닌 Enumeration
		Enumeration en = prop.propertyNames();
		
		while(en.hasMoreElements()) {
			String key = (String)en.nextElement();
			String value = prop.getProperty(key);
			System.out.println(key + " : " + value);
		}
	}
	
	public void method2() {
		
		Properties prop = new Properties();
		
		//순서유지 x, 키값 중복 x
		//prop에 키와 값(key, value) 저장
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		
		System.out.println(prop);
		
		
	}
}
