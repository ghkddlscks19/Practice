package basicmath1;

import java.util.Scanner;

public class BreakEvenPoint {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(c<=b) {
			System.out.println("-1");
		}else {
			System.out.println(a/(c-b)+1);
		}
		
		
		

	}

}
