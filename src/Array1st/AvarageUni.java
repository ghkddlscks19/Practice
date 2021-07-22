package Array1st;

import java.util.Scanner;

public class AvarageUni {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int[] arr = new int[tc];
		int sum = 0;
		
		for(int i=0; i<tc; i++) {
			int num = sc.nextInt();
			arr
		}
		
		for(int j=0; j<tc; j++) {
			int score = sc.nextInt();
			arr[j] = score;
			sum+=score;	
		}
		
		int cnt = 0;
		double avg = (double)sum/tc;
		
		for(int j=0; i<tc; j++) {
			if(arr[j]>avg) {
				cnt++;
			}else {
				continue;
			}
		}
		System.out.printf("%.3lf",cnt/tc*100);
		
	}

}
