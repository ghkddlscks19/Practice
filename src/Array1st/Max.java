package Array1st;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] array = new int[9];
		int max = 0;
		int count = 0;
		
		for(int i=0; i<9; i++) {
			array[i]= s.nextInt();
			if(max<array[i]) {
				max = array[i];
				count = i+1;
			}
		}
		System.out.println(max);
		System.out.println(count);

	}

}
