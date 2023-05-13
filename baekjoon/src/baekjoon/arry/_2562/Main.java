package baekjoon.arry._2562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[9];
		
		for(int i = 0; i < 9; i++) {
			a[i] = scan.nextInt();
		}
		int A = 0;
		for(int i = 0; i < 9; i++) {
			if(A < a[i]) {
				A = a[i];
			}
		}
		for(int i = 0; i < 9; i++) {
			if(a[i] == A) {
				System.out.println(A);
				System.out.println(i+1);
			}
		}
	}
}
