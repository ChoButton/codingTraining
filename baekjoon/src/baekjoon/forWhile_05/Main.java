package baekjoon.forWhile_05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		while(N != 0) {
			System.out.print("long");
			System.out.print(" ");
			N -= 4;
		}System.out.print("int");
	}
}
