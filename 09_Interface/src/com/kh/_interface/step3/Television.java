package com.kh._interface.step3;

public class Television implements RemoteControl{ //리모트컨트롤에서 인터페이스끼리 상속받아서 다시 재정의 해줘야함
	
	private int volume;
	
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void search(String url) {
		System.out.println("현재 TV 볼륨 :" + this.volume);
	}

	@Override
	public void setVolum(int volume) {
		
		if(volume > RemoteControl.MAX_VOLUME) {
			
			this.volume = RemoteControl.MAX_VOLUME;
		} 
			else if(volume < RemoteControl.MIN_VOLUME) {
			
				this.volume = RemoteControl.MIN_VOLUME;
				
		} else {
			
			this.volume =volume;
			
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	
	
}
