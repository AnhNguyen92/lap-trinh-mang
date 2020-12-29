package lab4;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		int[] months = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap thang trong nam");
		try {
			int month = sc.nextInt();
			if (month < 1 || month > 13) {
				System.out.println("Thang nhap phai tu 1 den 12");
			} else {
				System.out.println("Thang " + month + " co " + months[month - 1] + " ngay.");
			}
		} catch (Exception e) {
			System.out.println("Chu nhap khong phai la so.");
		}

		sc.close();
	}
}
