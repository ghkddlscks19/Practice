package StringExample;

import java.util.Scanner;

public class Croatia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int cnt = 0;
		
		

		for(int i=0; i<s.length();i++) {
			if(s.charAt(i) == 'c') {
				if(i<s.length()-1) {
					if(s.charAt(i+1) == '=') {
						i++;
					}else if(s.charAt(i+1) == '-') {
						i++;
					}
				}
				
			}else if(s.charAt(i) == 'd') {
				if(i<s.length()-1) {
					if(s.charAt(i+1) == '-') {
						i++;
					}else if(s.charAt(i+1) == 'z') {
						if(i<s.length()-2) {
							if(s.charAt(i+2) == '=') {
								i+=2;
							}
						}
						
					}
				}
				
			}else if(s.charAt(i) == 'n') {
				if(i<s.length()-1) {
					if(s.charAt(i+1) == 'j') {
						i++;
					}
				}
				
			}else if(s.charAt(i) == 'l') {
				if(i<s.length()-1) {
					if(s.charAt(i+1) == 'j') {
						i++;
					}
				}
				
			}else if(s.charAt(i) == 's') {
				if(i<s.length()-1) {
					if(s.charAt(i+1) == '=') {
						i++;
					}
				}
			
			}else if(s.charAt(i) == 'z') {
				if(i<s.length()-1) {
					if(s.charAt(i+1) == '=') {
						i++;
					}
				}
				
			}
			cnt++;
		}
	
		System.out.println(cnt);
		
	} 
}
