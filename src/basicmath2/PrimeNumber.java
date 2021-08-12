package basicmath2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int cnt = 0;
		int result = 0;
		
		for(int i=0; i<T; i++) {
			int n = sc.nextInt();
			cnt =0;
			for(int j=1; j<=n; j++) {
				if(n%j==0) {
					cnt++;
				}
				
			}
			if(cnt == 2) {
				result++;
				
			}
		
		}
		
		System.out.println(result);
	}

}
