package com.kh.project.model;

import java.util.Objects;

public class Food {

	private String kind;
	private String name;
	
	
	public Food() {}


	public Food(String kind, String name) {
		this.kind = kind;
		this.name = name;
	}


	public String getKind() {
		return kind;
	}


	public void setKind(String kind) {
		this.kind = kind;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "음식종류:" + kind + ", 이름:" + name ;
	}


	@Override
	public int hashCode() {
		return Objects.hash(kind, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return Objects.equals(kind, other.kind) && Objects.equals(name, other.name);
	}
	
	
	
	
	
}
