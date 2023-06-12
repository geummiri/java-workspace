package com.kh.stream.terminal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.kh.model.Student;

public class C_Collect {
/*
 * 수집
 * - 최종 처리 기능으로 필터링 또는 매핑한 요소들을 새로운 컬렉션으로 담아서
 * 	 리턴하는 collect()를 제공
 * 
 */
	public static void main(String[] args) {
		
		List<Student> students = Arrays.asList(
			new Student("김종휘", 17, "남자", 90, 100),	
			new Student("박승환", 16, "남자", 70, 80),	
			new Student("박진실", 15, "여자", 80, 90),	
			new Student("김민수", 14, "남자", 100, 70),	
			new Student("문병철", 18, "남자", 90, 60)	
				);
		
		//List(List or ArrayList) 컬렉션으로 수집 -> 수학 점수가 90점 이상인 사람들만
		List<Student> list = 
		students.stream()
			.filter(student -> student.getMath() >= 90)
			.collect(Collectors.toList());
//			.collect(Collectors.toCollection(() -> new ArrayList<>()));
			System.out.println(list);
			
	
		//Set(set or HashSet) 컬렉션으로 수집 -> 중학생이신 분들만
		students.stream()
			.filter(student -> student.getAge() <=16)
			.collect(Collectors.toSet());//-> set컬렉션으로 바꾸려면 collect 필요
//			.collect(Collectors.toCollection(() -> new HashSet<>()));
			System.out.println(list);
			
		//Map(Map or HashMap) 컬렉션으로 수집
		Map<String , Integer> map = students.stream()
				.collect(Collectors.toMap(student -> student.getName(), student -> student.getAge())); //map 출력_ 이름과 나이 출력
		HashMap<String, Integer> hMap = (HashMap<String , Integer>) map;//hMap 출력_ 이름과 나이 출력
		System.out.println(hMap);
	}

}
