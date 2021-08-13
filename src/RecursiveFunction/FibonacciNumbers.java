package RecursiveFunction;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(pivo(a));
	}
	public static int pivo(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			return pivo(n-2) + pivo(n-1);
		}
	}

}
