package baekjoon.arry._10811;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		int arr[] = new int[M];
		

		for(int a = 0; a < arr.length; a++) {
			arr[a] = a+1;
		}// 바구니에 숫자넣기
		
		for(int b = 0; b < N; b++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			int f = i;
			int l = j;
			int arr2[] = new int[M];
			for(int a = 0; a < arr.length; a++) {
				arr2[a] = arr[a];
			}
			for(; i <= j; i++) {
				arr[i-1] = arr2[l-1];
				l--;
			}
		}
		for(int a = 0; a < arr.length; a++) {
			System.out.print(arr[a] + " ");
		}
		
		
		
	}
}