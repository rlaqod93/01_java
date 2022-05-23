package com.pcwk.ex04.net;

import java.net.*;
import java.io.*;

public class TcpClient {
	
	// Socket
	// 프로세서간의 통신을 담당하며, Inputstream,Outputstream
	
	public static void main(String[] args) {
		//ServerIP, Port
		String serverIP = "192.168.3.24";//자신 IP주소
		int serverPort = 7778;
		
		//Socket
		try {
			Socket socket = new Socket(serverIP,serverPort);
			
			//소켓의 input 스트림 생성
			InputStream in =socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			//소켓의 입력을 출력한다.
			System.out.println("서버로 부터 받은 메세지: "+dis.readUTF());
			System.out.println("연결을 종료 합니다.");
			
			//스트림과 소켓을 닫는다.
			dis.close();
			socket.close();
			System.out.println("연결이 종료 되었습니다.");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
}
