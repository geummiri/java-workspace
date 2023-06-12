package com.kh.file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 바이트 기반 스트림
 * - 데이터를 바이트(byte) 단위로 주고 받는다.
 * - 그림, 멀티미디어 등의 바이너리 데이터를 읽고 출력할 때 사용
 * - InputStream, OutputStream : 바이트 기반 입출력 스트림의 최상위 클래스
 * 
 * 보조 스트림
 * - 스트림의 기능을 향상시키거나 새로운 기능을 추가하기 위해 사용
 * - 독립적으로 입출력을 수행할 수 없음
 * 
 */
public class ByteStreamTest {
	//바이너리 데이터(이미지파일)을 읽어서 파일로 출력하는 로직
	public static void main(String[] args) {
		
		String fileName = "src/bird.jpg";
		String outfileName = "src/bird_output.jpg";
		
		DataInputStream dis = null;
		DataOutputStream dos = null;
		//1. 스트림 생성 _ IO는 거의 컴파일 에러 뜨니까 try..catch해주셈
		try { 
			//먼저 기반 스트림을 생성
			//FileInputStream, FileOutputStream : 파일에 입출력을 하기 위한 스트림
			FileInputStream fis = new FileInputStream(fileName);
			FileOutputStream fos = new FileOutputStream(outfileName);
			
			//기반 스트림을 이용해서 보조스트림 생성
			//DataInputStream, DataOutputStream : 기본형 타입으로 읽고 쓰는 보조 스트림
			dis = new DataInputStream(fis);
			dos = new DataOutputStream(fos);
			
			//데이터를 읽어서 출력하기
			int data = 0;
			while((data = dis.read()) != -1) {
				dos.write(data);
			}
		}
			catch(EOFException e) {
				
				e.printStackTrace();
		}
				catch (IOException e) {
				e.printStackTrace();
		}
				finally {
					try {
						dis.close(); //보조스트림만 닫아주면 됨 
					} catch (IOException e) {
						e.printStackTrace();
					}
					try {
						dos.close(); //보조스트림만 닫아주면 됨 왜? 모르겠는뎅...
						//보조스트림은 기반스트림에 담겨있어서 보조만 닫아주면 됨
					} catch (IOException e) {
						e.printStackTrace();
				}
				
			}
			
		}
	}

