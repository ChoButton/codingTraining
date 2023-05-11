package baekjoon.arry._10807;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			int a = scan.nextInt();
			arr[i] = a;
		}
		
		int v = scan.nextInt();
		int caunting = 0;
		for(int surchNum : arr) {
			if(v == surchNum) {
				caunting++;
			}
		}
		System.out.println(caunting);
	}
}
