package com.pcwk.ex06.net;

import java.io.*;
import java.net.*;
import java.util.*;

public class TcpIpserver06 {
	
	HashMap<String,DataOutputStream> clients;
	
	public TcpIpserver06() {
		clients = new HashMap<>();
		Collections.synchronizedMap(clients);//HashMap 동기화
	}
	
	public void start() {
		//ServerSocket
		//Socket
		//ServerReceiver생성후 start()
		
		ServerSocket serverSocket= null;
		Socket socket = null;
		int port = 8888;
		
		
		try {
			System.out.println("서버가 시작 되었습니다.\nport:"+port);
			serverSocket = new ServerSocket();
			while(true) {
			serverSocket = new ServerSocket(port);
			socket = serverSocket.accept();
			//[192.168.3.101:78979]에서 접속!
			System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]"+"에서 접속!");
			
			ServerReceiver serverReceiver = new ServerReceiver(socket);
			serverReceiver.start();
			
			}
			
		} catch (IOException e) {
			
		}
		
		
	}//--start()
	
	public static void main(String[] args) {
		TcpIpserver06 main = new TcpIpserver06();
		main.start();
		
	}
	//모든 사용자에게 메세지 보내기
	public void sendToAll(String msg) {
		
		Iterator iter = clients.keySet().iterator();
		while(iter.hasNext()==true) {
			//HashMap에 있는 key(name),value(DataOutputStream)
			DataOutputStream ClientOut = (DataOutputStream) clients.get(iter.next());
			try {
				ClientOut.writeUTF(msg);
			} catch (IOException e) {
				
			}
		}
		
	}//--sendToAll
	
	class ServerReceiver extends Thread{
		Socket socket;
		DataInputStream in;//client 읽기
		DataOutputStream out;//client 출력
		
		public ServerReceiver(Socket socket) {
			this.socket = socket;
			
			try {
				in  = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}//--ServerReceiver(Socket socket)
		
		//데이터 읽고 , 데이터를 모든 사용자에게 전송
		@Override
		public void run() {
			String name = "";
			try {
				System.out.println("0-----------------------------in--"+in);
				name = in.readUTF();//client의 대화명
				System.out.println("1-------------------------------");
				sendToAll("#"+name+"님이 입장했습니다.");
				
				clients.put(name, out);//대화명key , DataOutputStream value
				System.out.println("현재 접속자 수는 "+clients.size()+" 입니다.");
				
				while(in!=null) {
					//읽은 메세지를 모든 사용자에게 전송
					sendToAll(in.readUTF());
				}
				
				
			} catch (IOException e) {
				System.out.println("10-----------------------------");
				System.out.println(e.getMessage());
			}finally {
				//접속 종료 처리
				sendToAll("#"+name+"님이 퇴장했습니다.");
				
				clients.remove(name);//client 정보를 HashMap에서 삭제
				System.out.println("["+socket.getInetAddress()+"]에서 접속 종료하였습니다.");
				System.out.println("현재 접속자 수는 "+clients.size()+" 입니다.");
			}
			
		}//--run
		
	}//--ServerReceiver
	

}//--TcpIpserver06
