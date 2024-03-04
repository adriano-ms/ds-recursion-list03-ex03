package view;

import java.util.Scanner;

import controller.InverseController;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		InverseController iv = new InverseController();

		String s = sc.next();
		System.out.println(iv.inverse(s, s.length()));
		
		sc.close();
	}

}
