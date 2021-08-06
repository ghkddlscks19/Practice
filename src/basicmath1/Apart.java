package basicmath1;

import java.util.Scanner;

public class Apart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[][] = new int[15][15];
	
		
		for(int i =0; i<15; i++) {
			arr[i][1] = 1;
			arr[0][i] = i;
		}
		for(int i=1; i<15; i++) {
			for(int k=2; k<15; k++) {
				
				arr[i][k] = arr[i-1][k]+arr[i][k-1];
			}
		}
		
		for(int i=0; i<T; i++) {
			int K = sc.nextInt();
			int N = sc.nextInt();
			System.out.println(arr[K][N]);
		}
		
	}

}
