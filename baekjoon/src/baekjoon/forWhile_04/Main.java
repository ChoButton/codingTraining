package baekjoon.forWhile_04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int N = scan.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= N; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			sum += a * b;
		}
		
		if(X == sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
