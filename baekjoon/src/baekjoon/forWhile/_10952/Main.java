package baekjoon.forWhile._10952;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = 1;
		int B = 0;
		
		while(A + B > 0) {
			A = scan.nextInt();
			B = scan.nextInt();
			if(A + B > 0) {
			System.out.println(A + B);
			}else {
				break;
			}
		}
	}
}
