package com.kh.socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ChattClient {

	//키보드로 입력받은 데이터를 읽어서 서버로 보낸다.
	//다시 서버가 보낸 메세지를 받아서 클라이언트 자신의 콘솔창에 출력
	public static void main(String[] args) {

			
		try {
			InetAddress ip = InetAddress.getLocalHost(); //소켓이 연결된 원격 호스트의 IP 주소를 반환
			//getInetAddress() 메서드는 InetAddress 객체를 반환
			
			//1.소켓 생성
			Socket s = new Socket("127.0.0.1", 60000); //ip주소랑 포트번호가 필요행
			System.out.println("Client Socket Creating...");
			
			//2.스트림
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			
			BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			while(true) {
				String line = br.readLine(); //26번에서 입력받은걸
				pw.println(line); //27번에서 서버로 보내는거얌
				
				System.out.println("내가 보낸 메세지 : " + br2.readLine());
				
			}
			
//			String line ="";
//			while((line=br.readLine()) != null) {
//				pw.println(line);
//			}
			
//			String line2 ="";
//			while((line2=br.readLine()) != null) {
//				System.out.println("서버에게 받은 메세지 : " + line2);
//			}
			
			
			
			
		} catch (IOException e) {
			System.out.println("서버와의 연결에 실패했습니다.");
		}
		
	}
	}


