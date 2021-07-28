package StringExample;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		String n = sc.next();
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			arr[i] = n.charAt(i)-48;
			sum+=arr[i];
		}
		System.out.println(sum);
		

	}
	

}
