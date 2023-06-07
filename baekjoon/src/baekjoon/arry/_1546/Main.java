package baekjoon.arry._1546;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		double[] arr = new double[N];
		double[] arr2 = new double[N];
		// 점수 담기
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextDouble(); 
		}
		
		// 가장 큰값 찾기
		double M = arr[0];  // 가장 큰 값 초기화
		for (int i = 1; i < N; i++) {
		    if (arr[i] > M) {
		        M = arr[i];
		    }
		}

		// 점수 재 계산
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = (arr[i] / M) * 100;
		}
		
		// 총 평균
		double sumAvg = 0;
		for(int i = 0; i < arr.length; i++) {
			sumAvg += arr2[i];
		}
		System.out.println(sumAvg / N);
	}

}
