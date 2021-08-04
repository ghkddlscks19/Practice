package basicmath1;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int cnt = 0; int room =0;
			
		for(int i = 0; i<testcase; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			if(W*H<N) {
				break;
			}else {
				for(int j=1; j<=W; j++) {
					for(int k=1; k<=H; k++) {
						if(cnt == N) {
							break;
						}
						room = (k*100)+j;
						cnt++;
						
					}
					
				}
				System.out.println(room);
				cnt=0;
				
			}
			
		

		}
		
	}

}
