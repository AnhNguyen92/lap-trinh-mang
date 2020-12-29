package lab4;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap ten cua ban");
		String fullName = sc.nextLine();
		String[] names = fullName.split(" ");
		System.out.println("Ten cua ban la " + names[names.length - 1]);

		sc.close();
	}
}
