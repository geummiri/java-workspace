package com.kh.polymorphism.controller;

import com.kh.polymorphism.model.child.Engineer;

import com.kh.polymorphism.model.parent.Employee;

public class EmployeeController {
	
	
	//Employee 객체배열과 이름을 가지고 와서 일치한 사람 반환
	public Employee findEmployeeByName(Employee[] ea,String name) {
		
//		for(int i=0; i<ea.length; i++) {
//	
//		if(ea[i].getName().equals(name)) {
//			
//			return ea[i];
//		}
//	}
//		return null;
		
		Employee emp = null;
		
		for(Employee employee : ea ) {
			if(employee.getName().equals(name))
				emp = employee;
		}
	
		return emp;
		
}
	
	//연봉계산 : engineer인 경우 보너스가 있음!
	public int getAnnualSalary(Employee e) {
		
		//instanceof 연산자
		//어떤 클래스 형의 인스턴스의 주소를 참조하고 있는지 확인할 때 사용
		if(e instanceof Engineer) { //클래스 Employee 가 있으면 그 안에있는 객체 하나를 인스턴스라고 함
			
			Engineer eg = (Engineer) e; //부모 -> 자식 : 강제 형 변환!
			
			return e.getSalary() * 12 + eg.getBonus();
		}
		
		return e.getSalary()*12;
	}
	
	//전체 연봉 총 합계
	public int getTotalCoast(Employee[] ea) {
		
		int sum=0;
		
		for(int i=0; i<ea.length; i++) {
			
		sum  += this.getAnnualSalary(ea[i]);
		
		return sum;
				
		}
		
		return 0;
	}

}