package Array1st;

import java.util.Scanner;

public class oxquiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		for(int i=0; i<num; i++) {
			int count = 0;
			int score = 0;
			String s = sc.next();
			for(int j=0; j<s.length(); j++) {
			if(s.charAt(j)=='O') {
				count++;
				score+=count;
			}else {
				count =0;
				}
		    }
			System.out.println(score);
		}
		
	}

}
