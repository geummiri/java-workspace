package com.kh._interface.step3;

public interface Volume {
	
	//인터페이스는 = 추상 메서드 + 상수
	/*public static final <-- 숨겨져 있음 */ int MAX_VOLUME = 10; //상수는 대문자로만 작성 가능
	int MIN_VOLUME = 0;
	
	//인터페이스에서 메서드는 무조건 추상 메서드!
	/*public abstract*/ void setVolum(int volume);
	
	
	
}
