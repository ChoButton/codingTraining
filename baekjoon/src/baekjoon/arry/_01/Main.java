package baekjoon.arry._01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] array = new int[N];
		
		for(int i = 0; i < N; i++) {
			array[i] = scan.nextInt();
		}
		
		int V = scan.nextInt();
		int sum = 0;
		
		for(int j = 0; j < N; j++) {
			if(array[j] == V) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
