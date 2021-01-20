package net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class SocketInfo {
	public static void main(String[] args) {
			try {
				
				Socket theSocket = new Socket("localhost", 5000);
				System.out.println("Connected to " + theSocket.getInetAddress() + " on port " + theSocket.getPort()
						+ " from port " + theSocket.getLocalPort() + " of " + theSocket.getLocalAddress());
			} catch (UnknownHostException e) {
				System.err.println("I can't find " );
			} catch (SocketException e) {
				System.err.println("Could not connect to " );
			} catch (IOException e) {
				System.err.println("socketInfo " + e);
			}
	} // end main
} // end getSocketInfo