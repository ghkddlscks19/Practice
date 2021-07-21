package Array1st;

import java.util.Scanner;

public class MaxMini {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int max = -1000000;
		int mini = 1000000;
		int num = s.nextInt();
		int[] array = new int[num];
		
		for(int i=0; i<num; i++) {
			array[i] = s.nextInt();
			if(max<array[i]) {
				max = array[i];
			}if(mini>array[i]){
				mini = array[i];
			}
		}
		System.out.println(mini+" "+max);
		
	}

}

