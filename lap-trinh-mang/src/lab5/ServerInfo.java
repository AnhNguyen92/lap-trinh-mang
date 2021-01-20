package lab5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JScrollPane;

/**
 * 
 * @author Tuan Anh
 *
 *	Bài 1
 */
public class ServerInfo {
	private JFrame frame;
	private JTextField txtServer;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerInfo window = new ServerInfo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ServerInfo() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblProgramName = new JLabel("Chương trình tìm kiếm thông tin Server");
		lblProgramName.setForeground(Color.BLUE);
		lblProgramName.setBounds(0, 0, 450, 28);
		lblProgramName.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblProgramName);

		JLabel lblHostName = new JLabel("Nhập hostname:");
		lblHostName.setBounds(15, 40, 103, 24);
		frame.getContentPane().add(lblHostName);

		txtServer = new JTextField();
		txtServer.setBounds(130, 39, 299, 26);
		frame.getContentPane().add(txtServer);
		txtServer.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(81, 111, 348, 133);
		frame.getContentPane().add(scrollPane);

		JTextArea txtaResult = new JTextArea();
		txtaResult.setLineWrap(true);
		scrollPane.setViewportView(txtaResult);

		JButton btnGetInfo = new JButton("Tìm kiếm");
		btnGetInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String hostname = txtServer.getText();
				try {
					Socket socket = new Socket(hostname, 80);
					System.out.println("Connected to " + socket.getInetAddress() + " on port " + socket.getPort()
							+ " from port " + socket.getLocalPort() + " of " + socket.getLocalAddress());
					socket.close();
					String newline = "\n";
					txtaResult.setText("- Địa chỉ IP: " + socket.getInetAddress().toString() + newline + "- Cổng kết nối: "
							+ socket.getPort() + newline + "- Địa chỉ máy kết nối: " + socket.getLocalAddress()
							+ newline + "- Cổng của máy kết nối: " + socket.getLocalPort() + newline);
				} catch (UnknownHostException ex) {
					System.err.println("I can't find " + hostname);
					txtaResult.setText("Không tìm thấy thông tin của host: " + hostname);
				} catch (SocketException ex1) {
					System.err.println("Could not connect to " + hostname);
					txtaResult.setText("Không thể kết nối tới địa chỉ: " + hostname);
				} catch (IOException ex2) {
					System.err.println(e);
				}
			}
		});
		btnGetInfo.setBounds(158, 77, 117, 29);
		frame.getContentPane().add(btnGetInfo);

		JLabel lblServerAddress = new JLabel("Kết Quả:");
		lblServerAddress.setBounds(15, 111, 59, 16);
		frame.getContentPane().add(lblServerAddress);

	}
}
