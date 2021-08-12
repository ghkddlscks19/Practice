package basicmath2;

import java.util.Scanner;

public class PrimeNumber3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		boolean arr[] = new boolean[1000001];
		arr[0] = arr[1] = true;
		
		
		for(int i =2; i*i<=n; i++) {
			for(int j =i*i; j<=n; j+=i) {
				arr[j] = true;
			}
			
		}
		for(int i=0; i<=n; i++) {
			if(arr[i]==false) {
				System.out.println(i);
			}
		}

	}

}
