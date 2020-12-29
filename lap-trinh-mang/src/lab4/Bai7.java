package lab4;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Bai7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap dia chi hostname de tim kiem dia chi IP:");
		String hostname = sc.nextLine();
		InetAddress inet = null;
		try {
			inet = InetAddress.getByName(hostname);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} // Getting IP address from hostname in Java
		String IPAddress = inet.getHostAddress();
		System.out.printf("Dia chi IP cua host %s la %s %n", hostname, IPAddress);
		sc.close();
	}
}
