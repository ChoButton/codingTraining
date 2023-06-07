package baekjoon.arry._3052;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A[] = new int[10];
		int B = 42;
		int count = 10;
		
		for(int i = 0; i < A.length; i++) {
			A[i] = (scan.nextInt() % B);
		}
		
		for(int b = 0; b < 10; b++) {
			int j = b + 1;
			boolean a = true;
				while(a){
					if(j < 10) {
					if(A[b] != A[j]) {
						j++;
					}else {
						a = false;
						count--;
					}
					}else {
						a = false;
					}
				}

		}
		System.out.println(count);
		
		
	}

}
