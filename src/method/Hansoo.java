package method;

import java.util.Scanner;

public class Hansoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(d(n));
		

	}
	public static int d(int n) {
		int count = 0;
		
		if(n<100) {
			return n;
		}else {
			count = 99;
			if(n==1000) {
				n = 999;
			}
		}
			
		for(int i=100; i<=n; i++) {
			
			int one = i%10; 
			int ten = i/10%10; 
			int hun = i/100;
			if((2*ten)==(one+hun)) {
				count++;	
			}	
		}
		
		return count;
	}
}
