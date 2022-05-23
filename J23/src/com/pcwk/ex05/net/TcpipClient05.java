package com.pcwk.ex05.net;

import java.io.IOException;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpipClient05 {

	public static void main(String[] args) {
		String serverIp = "192.168.3.18";//192.168.3.24
		int port = 8888;
		
		try {
			//clinet socket생성
			Socket socket = new Socket(serverIp, port);
			System.out.println(getTime()+"서버에 접속되었습니다.");
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * 시스템 현재 시간 return
	 * @return
	 */
	public static String getTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
		return sdf.format(new Date());
	}
}
