package exercise.a819.server;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
	public static void main(String[] args) {
		ServerSocket so = null;
		Socket s = null;
		OutputStream ff = null;
		BufferedOutputStream bo = null;
		try {
			so = new ServerSocket(0532);
			s = so.accept();
			ff = s.getOutputStream();
			
		} catch (IOException e) {
			System.out.println("¶Ë¿Ú´íÎó");
		}
	}
}
