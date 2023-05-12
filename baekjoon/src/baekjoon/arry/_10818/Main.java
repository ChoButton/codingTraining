package baekjoon.arry._10818;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M[] = new int[N];
		int A = 0;
		int B = 0;
		for(int i = 0; i < N; i++) {
			M[i] = scan.nextInt();
		}
		B = M[0];
		A = M[0];		
		for(int i = 0; i < N; i++) {
				if(B < M[i]) {
					B = M[i];
			}
		}
		for(int i = 0; i < N; i++) {
				if(A > M[i]) {
					A = M[i];
			}
		}	
		System.out.println(A + " " + B);
	}
}
