package com.gmail.jenya.isa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("input n");
		n = sc.nextInt();
		int result = 1;
		for (int i = 1; i <= n; i++) {
			if ((4 < n) && (n < 16)) {
				result = result * i;
				System.out.println(result);

			} else {
				System.out.println("не существует");
				break;
			}
		}
	}

}
