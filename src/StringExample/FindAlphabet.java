package StringExample;

import java.util.Scanner;

public class FindAlphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int[] arr2 = new int[26];
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = -1;
		}
		
		
		for(int i=0; i<s.length(); i++) {
			if(arr2[s.charAt(i)-97]==-1) {
				arr2[s.charAt(i)-97]=i;
			}
			
		}
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
	}

}
