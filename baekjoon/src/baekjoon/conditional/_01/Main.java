package baekjoon.conditional._01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		scan.close();
		
		if(A > B) {
			System.out.println(">");
		}else if(A < B) {
			System.out.println("<");
		}else if(A == B) {
			System.out.println("==");
		}
		
	}

}
