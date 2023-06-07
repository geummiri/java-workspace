package com.kh.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.kh.list.model.Person;

	/*
	 * 컬랙션 : 자바에서 제공하는 자료구조를 담당하는 프레임워크
	 * - java.util 패키지에 컬랙션과 관련된 인터페이스와 클래스들이 포함
	 * - 컬랙션을 사용하면 데이터 추가, 삭제, 정렬 등의 처리가 간단하게 해결되어
	 * 	 자료구조적 알고리즘을 구현할 필요가 없음
	 * 
	 *  * List
	 *  - 중복허용 
	 *  - 순서있음
	 */

	public class A_ArrayList {

		public static void main(String[] args) {
			
			A_ArrayList a = new A_ArrayList();
//			a.method1();
			a.method2();
//			a.method3();
		}
		
		public void method1() {
			
			
			List list = new ArrayList();
			
			list.add("김민소");
			list.add("김민수");
			list.add("김준우");
			list.add("김준영");
			list.add("박주영");
			
			System.out.println(list);
		}		
		
		public void method2() {
			
			/*
			 * 제네릭스(Generics)
			 * - 컴파일시 타입을 체크해주는 기능
			 * - <> 다이아몬드 연산자 사용
			 * 
			 * 컬랙션에서 사용하는 이유
			 * - 명시된 타입의 객체만 저장하도록 제한을 두기 위해 사용
			 * 
			 */
			
			ArrayList<Person> list = new ArrayList();
			
			//1.add(E e) : 리스트 끝에 추가
			list.add(new Person("전현무", "삼섬동", 45));
			list.add(new Person("남궁민", "서울숲", 45));
			list.add(new Person("이시언", "상도", 40));
			list.add(new Person("이제훈", "서울숲", 38)); //리스트는 순서대로 들어감
//			list.add("유재석"); //person 클래스의 기본타입과 달라도 컴파일 에러 안뜨나 , 
//			<> 다이아몬드 연산자 제네릭스 <Person> 사용하면 에러뜸 / 맨앞 배열이름 바로뒤에 붙여주기 ArrayList<Person>
	
			//2.add(int index, E e) : 인덱스를 지정하여 해당 인덱스에 추가
			list.add(1, new Person("유재석", "압구정", 50)); //1번째 인덱스에 값 출력
			list.add(3, new Person("강호동", "압구정", 52));
			
			//3.set(int index, E e) : 해당 인덱스의 값을 변경
			list.set(3, new Person("오은영", "강남", 57)); //3번째에 있는 강호동 사라지고 오은영 출력됨 / get set이랑 비슷
//			System.out.println(list);

			//4.size() : 리스트 안에 몇 개의 데이터가 있는지
			System.out.println("사람 수 : " + list.size()); // 리스트의 사이즈 메서드사용하면 정수 값 출력
			
			//5.remove(int index) : 해당 인덱스의 객체 삭제
			System.out.println(list.remove(0) + " 삭제"); //0번째 배열 remove하면 false타입으로 반환하고 삭제 --> (Person [name=전현무, addr=삼섬동, age=45] 삭제)
//			System.out.println(list); //remove 사용하고 다시 출력하면 0번째 배열 삭제
			
			//6.get(int index) : 해당 인덱스로 객체 가져오기
			System.out.println(list.get(0)); //0번째 인덱스 배열 가져옴
			
			//7.subList(int index1, int index2) : 추출해서 새로운 List로 반환
			List sub = list.subList(0, 2); //0,1 까지만 담겨짐
			System.out.println(sub);
			
			//8.addAll(Collection c) : 컬랙션을 통채로 뒤에 추가하는 메서드
			list.addAll(sub);
			System.out.println(list); //기존 list 배열 + sub에 출력된거 마지막에 출력됨
			
			//9.isEmpty() : 컬랙션이 비어있는지 묻는 메서드
			System.out.println("리스트가 비어있는지 : " + list.isEmpty()); //안비어있어서 false로 반환됨
			
			
			//리스트에 저장된 사람들의 평균 연령을 출력
			
			int sum = 0;

			for(int i=0; i<list.size(); i++) {

				sum += list.get(i).getAge();
			}	

			int avg = sum / list.size(); 

			System.out.println(avg);

			//저장된 사람들의 이름만 출력

			for(int i=0; i<list.size(); i++) {

				list.get(i).getName();
				System.out.print(list.get(i).getName());
			}

			//향상된 for문 더짧으니까 이거 써야되는데 어려운디
			for(Person p : list) {
//				System.out.println(p.getName() + " ");

			}
			
			//서울숲에 사는 사람들만 출력

			for(int i=0; i<list.size(); i++) {

				if(list.get(i).getAddr().equals("서울숲")) {
//					System.out.println(list.get(i));
				}
			}

			//향상된 for문
			for(Person p : list) {
				if(p.getAddr().equals("서울숲")) {
//					System.out.println(p);
				}
			}
			
			//나이 순서대로 출력 -> Person 클래스에서 --> 하단에 public int compareTo(Person o) 메서드에서 조건문 작성해주기
			
			Collections.sort(list); //Person클래스에서 implements Comparable<Person> 작성해주고 add compare to() override 해줘야함
//			System.out.println(list); 
			
			//나이순서 -> 이름순서대로 -> 조건문 : return this.name.compareTo(name);
			
			Collections.sort(list);
//			System.out.println(list);
			
			//10.clear() : 싹 비우기!!
			list.clear();
//			System.out.println("리스트가 비어있는지 : " + list.isEmpty()); //true값 추출
//			System.out.println(list);//[]
			}
		
		
		
			public void method3() {
			//11.indexOf(Object o) : 해당 객체가 위치하는 인덱스값 반환
			List<String> list = new ArrayList<>();
			list.add("apple");
			list.add("orange");
			list.add("mango");
			list.add("grape");
			
			System.out.println(list.indexOf("apple")); //애플에 있는 인덱스 값 추출 -> 1
			
			
			//12.오름차순 정렬
			Collections.sort(list);
			System.out.println(list); //[apple, banana, grape, mango, orange]
			
			//13.내림차순 정렬
			Collections.reverse(list); //오름차순 정렬 후!
			System.out.println(list); //[orange, mango, grape, banana, apple]
			
			
			}
		
		
}

