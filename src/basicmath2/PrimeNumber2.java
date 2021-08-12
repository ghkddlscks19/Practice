package basicmath2;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum =0;
		int mini = 10000;
		int cnt =0;
		
		for(int i =M; i<=N; i++) {
			for(int j=2; j<i; j++) {		
				if(i%j == 0) {
					cnt++;
				}
				
			}
			
			if(cnt == 0 && i!=1) {
				sum+=i;
				if(mini>i) {
					mini = i;
				}
			}
			cnt =0;
		}
		if(sum==0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(mini);
		}
		
	}

}
