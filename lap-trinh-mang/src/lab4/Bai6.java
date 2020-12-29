package lab4;

import java.util.Scanner;

public class Bai6 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Moi nhap chuoi s1");
	String s1 = sc.nextLine();
	System.out.println("Moi nhap chuoi s2");
	String s2 = sc.nextLine();
	System.out.println(s1.contains(s2) ? "Chuoi s1 co chua chuoi s2" : "Chuoi s1  khong chua chuoi s2");
	
	sc.close();
}
}
