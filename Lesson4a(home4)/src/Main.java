

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width;
		System.out.println("input width");
		width = sc.nextInt();
		int height;
		System.out.println("input height");
		height = sc.nextInt();
		for (int i = 0; i < height; i++) {
		
			for (int j = 0; j < width; j++) {
				
				if (i == 0 || j == 0) {
					System.out.print("*");
				}else if (i == height-1 || j == width-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
				
			}
			System.out.println("");
		}

	}

}
