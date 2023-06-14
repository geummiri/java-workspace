package com.kh.step3;

import java.awt.Toolkit;

public class BeepPrintThread implements Runnable {

	@Override
	public void run() {
	
	Toolkit tool = Toolkit.getDefaultToolkit();
	for(int i=0; i<5; i++) {
		tool.beep(); //경고음
		try {
			Thread.sleep(1000); 
		} catch (InterruptedException e) {}
}
	
	
	}
}
