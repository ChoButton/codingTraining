package baekjoon.conditional._06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int money = 0;
		scan.close();
		
		if(a == b && a == c && c == b) {
			money = 10000 + (a * 1000);
		}else if(a == b) {
			money = 1000 + (a * 100);
		}else if(a == c) {
			money = 1000 + (a * 100);
		}else if(b == c) {
			money = 1000 + (b * 100);
		}else {
			if(a > b && a > c) {
				money = a * 100;
			}else if(b > a && b > c) {
				money = b * 100;
			}else if(c > a && c > b) {
				money = c * 100;
			}
		}
		System.out.println(money);
	}

}
