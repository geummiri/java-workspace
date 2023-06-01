package com.kh._interface.step3;

public interface RemoteControl extends Searchable, Volume{ //인터페이스끼리 상속받음 다중 상속(Searchable, Volume) 가능
	
	void turnOn();
	void turnOff();
	
}
