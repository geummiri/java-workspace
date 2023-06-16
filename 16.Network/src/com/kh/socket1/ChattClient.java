package com.kh.socket1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChattClient {
	
	public static void main(String[] args) {
		
		//키보드로 입력받은 데이터를 읽어서 서버로 출력
		
		//클라이언트측 로직
		try {
			//1.소켓 생성
			Socket s = new Socket("127.0.0.1", 60000); //ip주소랑 포트번호가 필요행
			System.out.println("Client Socket Creating...");
			
			//2.스트림
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//사용자의 입력을 받기위해서 BufferedReader 객체 생성
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			//클라이언트 출력 스트림 설정 /          소켓의 출력 스트림 반환 /   받은 값들 계속 저장
		
			String line ="";
			while((line=br.readLine()) != null) { //사용자가 입력한 내용을 한줄씩 읽어와
				pw.println(line); //읽어오면 서버로 전송
			}
			
		} catch (IOException e) {
			System.out.println("서버와의 연결에 실패했습니다.");
		}
		
	}
}
