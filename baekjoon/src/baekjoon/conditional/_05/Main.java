package baekjoon.conditional._05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		scan.close();
		if((M - 45) < 0) {
			H--;
			M = 60 + (M - 45);
			if(H < 0) {
				H += 24;
			}
		}else {
			M = M - 45;
		}
		System.out.println(H + " " + M);
	}

}

