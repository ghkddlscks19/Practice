package basicmath2;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a == 0 && b == 0 && c == 0) {
				break;
			}else {
				if(a>b && a>c) {
					if(c*c+b*b==a*a) {
						System.out.println("right");
					}else {
						System.out.println("wrong");
					}
				}if(b>a && b>c) {
					if(c*c+a*a==b*b) {
						System.out.println("right");
					}else {
						System.out.println("wrong");
					}
				}if(c>a && c>b) {
					if(b*b+a*a==c*c) {
						System.out.println("right");
					}else {
						System.out.println("wrong");
					}
				}
			}
		}

	}

}
