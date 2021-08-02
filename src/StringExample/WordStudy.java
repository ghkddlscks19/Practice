package StringExample;

import java.util.Scanner;

public class WordStudy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next().toUpperCase();
		int[] arr = new int[26];
		int max = 0;
		int index = 0;
		boolean tr = true;
	
	
		for(int i=0; i<s.length(); i++) {
			arr[s.charAt(i)-65]++;
			
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				index = i;
				tr = true;
			}else if(arr[i]==max){
				tr = false;
			}
		}
		if(tr) {
			System.out.println((char)(index+65));
		}else {
			System.out.println("?");
		}
			
	}

}
