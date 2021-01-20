package lab5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

/**
 * 
 * @author Tuan Anh
 *
 *	Bài 2
 */
public class MiniChatUI {

	private JFrame frmMiniChatServerclient;
	private JTextField txtHostAddress;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniChatUI window = new MiniChatUI();
					window.frmMiniChatServerclient.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MiniChatUI() {
		initialize();
	}

	private void initialize() {
		frmMiniChatServerclient = new JFrame();
		frmMiniChatServerclient.setTitle("Mini chat Server-Client");
		frmMiniChatServerclient.setBounds(100, 100, 786, 534);
		frmMiniChatServerclient.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMiniChatServerclient.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(333, 183, 1, 16);
		frmMiniChatServerclient.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(68, 61, 1, 16);
		frmMiniChatServerclient.getContentPane().add(textArea_1);
		
		JLabel lblNewLabel = new JLabel("Host address:");
		lblNewLabel.setBounds(6, 11, 100, 16);
		frmMiniChatServerclient.getContentPane().add(lblNewLabel);
		
		txtHostAddress = new JTextField();
		txtHostAddress.setBounds(118, 6, 130, 26);
		frmMiniChatServerclient.getContentPane().add(txtHostAddress);
		txtHostAddress.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Host address:");
		lblNewLabel_1.setBounds(275, 11, 100, 16);
		frmMiniChatServerclient.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(387, 6, 130, 26);
		frmMiniChatServerclient.getContentPane().add(textField);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(275, 56, 100, 16);
		frmMiniChatServerclient.getContentPane().add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(387, 51, 130, 26);
		frmMiniChatServerclient.getContentPane().add(textField_1);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(6, 56, 100, 16);
		frmMiniChatServerclient.getContentPane().add(lblUsername);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(118, 51, 130, 26);
		frmMiniChatServerclient.getContentPane().add(textField_2);
		
		JButton btnConnect = new JButton("Kết nối");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConnect.setBounds(529, 6, 246, 29);
		frmMiniChatServerclient.getContentPane().add(btnConnect);
		
		JButton btnLogin = new JButton("Đăng nhập");
		btnLogin.setBounds(529, 51, 117, 29);
		frmMiniChatServerclient.getContentPane().add(btnLogin);
		
		JButton btnSignUp = new JButton("Đăng Ký");
		btnSignUp.setBounds(658, 51, 117, 29);
		frmMiniChatServerclient.getContentPane().add(btnSignUp);
		
		JList list = new JList();
		list.setBounds(6, 125, 509, 312);
		frmMiniChatServerclient.getContentPane().add(list);
		
		JTextArea txtrTxtchatcontent = new JTextArea();
		txtrTxtchatcontent.setText("txtChatContent");
		txtrTxtchatcontent.setBounds(191, 211, 1, 16);
		frmMiniChatServerclient.getContentPane().add(txtrTxtchatcontent);
		
		JLabel lblNewLabel_2 = new JLabel("Nhóm:");
		lblNewLabel_2.setBounds(539, 95, 61, 16);
		frmMiniChatServerclient.getContentPane().add(lblNewLabel_2);
		
		JList list_1 = new JList();
		list_1.setBounds(535, 125, 230, 92);
		frmMiniChatServerclient.getContentPane().add(list_1);
		
		JButton btnCreateGroup = new JButton("Tạo nhóm");
		btnCreateGroup.setBounds(658, 92, 117, 29);
		frmMiniChatServerclient.getContentPane().add(btnCreateGroup);
		
		JList list_2 = new JList();
		list_2.setBounds(535, 286, 230, 144);
		frmMiniChatServerclient.getContentPane().add(list_2);
		
		JLabel lblNewLabel_3 = new JLabel("Bạn bè:");
		lblNewLabel_3.setBounds(539, 250, 61, 16);
		frmMiniChatServerclient.getContentPane().add(lblNewLabel_3);
		
		JButton btnAddFriend = new JButton("Thêm bạn");
		btnAddFriend.setBounds(658, 245, 117, 29);
		frmMiniChatServerclient.getContentPane().add(btnAddFriend);
		
		JLabel lblNewLabel_4 = new JLabel("Nội dung chat:");
		lblNewLabel_4.setBounds(6, 97, 100, 16);
		frmMiniChatServerclient.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tin nhắn:");
		lblNewLabel_5.setBounds(6, 449, 61, 16);
		frmMiniChatServerclient.getContentPane().add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(68, 444, 449, 26);
		frmMiniChatServerclient.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnSend = new JButton("Gửi tin");
		btnSend.setBounds(529, 444, 246, 29);
		frmMiniChatServerclient.getContentPane().add(btnSend);
		
		JLabel lblNewLabel_6 = new JLabel("File");
		lblNewLabel_6.setBounds(8, 477, 61, 16);
		frmMiniChatServerclient.getContentPane().add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(68, 472, 449, 26);
		frmMiniChatServerclient.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Gửi");
		btnNewButton.setBounds(658, 472, 117, 29);
		frmMiniChatServerclient.getContentPane().add(btnNewButton);
		
		JButton btnChooseFile = new JButton("Choose file");
		btnChooseFile.setBounds(529, 472, 117, 29);
		frmMiniChatServerclient.getContentPane().add(btnChooseFile);
	}
}
