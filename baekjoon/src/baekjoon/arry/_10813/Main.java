package baekjoon.arry._10813;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int arr[] = new int[N];
		
		for(int a = 0; a < N; a++) {
			arr[a] = (a + 1);
		}// arr 초기화
		
		for(int a = 0; a < M; a++) {
			int i = (scan.nextInt()-1);
			int j = (scan.nextInt()-1);
			int sub = arr[i];
			arr[i] = arr[j];
			arr[j] = sub;
		}
		for(int a = 0; a < N; a++) {
			System.out.print(arr[a] + " ");
		}
		
	}

}
