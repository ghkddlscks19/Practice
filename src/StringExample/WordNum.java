package StringExample;

import java.util.Scanner;

public class WordNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim();
		int cnt = 1;
		char bl = ' ';
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==bl) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
	}

}