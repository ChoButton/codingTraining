package baekjoon.arry._5597;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[31];
		arr[0] = 1;
		for(int i = 0; i < 28; i++) {
			int a = scan.nextInt();
			arr[a] = 1; 
		}
		for(int i = 0; i <= 30; i++) {
			if(arr[i] != 1) {
				System.out.println(i);
			}
		}
	}
}
