package lab4;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap so a");
		int a = sc.nextInt();
		System.out.println("moi nhap so b");
		int b = sc.nextInt();
		System.out.println("Tong hai so la");
		System.out.println(a + " + " + b + " = " + (a + b));

		sc.close();
	}
}
