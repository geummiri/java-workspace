package com.kh.socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattServer {

	//클라이언트가 보낸 메세지를 받아서 다시 클라이언트에게 받은 메세지를 보낸다.
	
	public static void main(String[] args) {
	
		try {
			ServerSocket server = new ServerSocket(60000);
			System.out.println("서버 시작");
			
			Socket s = server.accept();
			System.out.println("클라이언트 소켓");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true); //클라이언트에 값 보내려면 output있어야함
			
			String line = "";
			while((line = br.readLine()) != null) {
				System.out.println("[" + s.getInetAddress() + "] 가 보낸 메세지 : " + line); //클라이언트 33번 줄에서 넘겼으니까 여기서 받았어
				
				pw.println(line);//서버에서 line 받은걸 클라이언트로 넘겨야해
			}
			
			
			br.close();
			
		} catch (IOException e) {
			System.out.println("클라이언트와 연결이 끊어졌습니다.");
		}
		
	}
}
