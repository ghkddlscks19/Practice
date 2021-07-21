package Array1st;

import java.util.Scanner;

public class namugi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int same = 0;
		int[] array = new int[10];
		int count = 0;
		for(int i=0; i<10; i++) {
			array[i] = sc.nextInt() % 42;
		}
		for(int i=0; i<10; i++) {
			same = 0;
			for(int j=i+1; j<10; j++) {
				if(array[i]==array[j]) {
					same++;
				}
			}
			if(same==0) {
				count++; 
			}
		}
		System.out.println(count);
	}

}
