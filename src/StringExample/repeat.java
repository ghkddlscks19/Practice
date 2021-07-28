package StringExample;

import java.util.Scanner;

public class repeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			int n = sc.nextInt();
			String s = sc.next();
			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<n; k++) {
					char c = s.charAt(j);
					System.out.print(c);
				}
				
			}
			System.out.println();
		}
		

	}

}
