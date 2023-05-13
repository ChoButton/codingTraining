package baekjoon.arry._10810;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int[] N = new int[scan.nextInt()];
		int M = scan.nextInt();
		
		for(int a = 0; a < N.length; a++) {
			N[a] = 0;
		} // 배열 기본값 0으로 초기화
		
		for(int a = 0; a < M; a++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			int k = scan.nextInt();
			for(int b = i-1; b < j; b++) {
				N[b] = k;
			}
		}
		for(int a = 0; a < N.length; a++) {
			System.out.print(N[a] + " ");
		}
	}

}
