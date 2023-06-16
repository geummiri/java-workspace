import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) {
		
		
		try {
			//1.소캣 생성하기 (ip주소, 포트 값 입력) 소캣 임포트하고 try..catch로 잡기
			Socket socket = new Socket("192.168.10.51", 60000);
			
			//2.버퍼리더 생성 -> 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw =new PrintWriter(socket.getOutputStream(), true);
			
		} catch (IOException e) {
			System.out.println("서버연결안됨");
		}
		
	}

}
