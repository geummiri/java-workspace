package com.kh.console;

//import java.util.*;
import java.io.*;

public class Test {

	
		public static void main(String[] args) {
			
		//스트림 생성
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		//스트림읽어오기
		try {
		String line = br.readLine();
		if(line!=null) {
		//콘솔로 출력
			System.out.println(line);
			line = br.readLine();
		}
		} catch(IOException e) {
			e.printStackTrace();
		} 
			finally {
				try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//읽어온거 클로즈하기 트라이캐치도 하기 
		}
		
}
}
		
