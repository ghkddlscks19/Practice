package basicmath2;

import java.util.Scanner;

public class GongJoon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			int n = sc.nextInt();
			boolean arr[] = new boolean[2*n+1];
			int cnt =0;
			
			if(n==0) {
				break;
			}
			for(int i =n+1; i<=2*n; i++) {
				arr[i] = true;
			}
			for(int i =2; i*i<=2*n; i++) {
				for(int j = i*i; j<=2*n; j+=i) {
					arr[j] = false;
				}
			}
			arr[0] = arr[1] = false;
			for(int i =2; i<=2*n; i++) {
				if(arr[i] == true) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}
