package StringExample;

import java.util.Scanner;

public class SangSu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = s.substring(0,3);
		String s2 = s.substring(4,7);
		String re1 = "", re2 = "";
		
		for(int i= s1.length()-1; i>=0 ; i--) {
			re1 = re1 + s1.charAt(i);	
		}
	
		for(int i= s2.length()-1; i>=0; i--) {
			re2 = re2 + s2.charAt(i);
		}
		
		if(Integer.parseInt(re1) > Integer.parseInt(re2) ) {
			System.out.println(re1);
		}else {
			System.out.println(re2);
		}

	}

}
