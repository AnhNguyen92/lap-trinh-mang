package lab4;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap dia chi hostname de tim kiem dia chi IP:");
		String hostname = sc.nextLine();
		try {
			Socket socket = new Socket(hostname, 80);
			System.out.println("Connected to " + socket.getInetAddress() + " on port " + socket.getPort()
					+ " from port " + socket.getLocalPort() + " of " + socket.getLocalAddress());
			socket.close();
		} catch (UnknownHostException e) {
			System.err.println("I can't find " + hostname);
		} catch (SocketException e) {
			System.err.println("Could not connect to " + hostname);
		} catch (IOException e) {
			System.err.println(e);
		}
		sc.close();
	}

}
