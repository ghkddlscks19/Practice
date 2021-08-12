package basicmath1;

import java.util.Scanner;

public class SugarDelivery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kg = sc.nextInt();
		int result = 0;
		
		if(kg == 4 || kg ==7) {
			System.out.println(-1);
		}else if(kg%5 == 1 || kg%5 ==3) {
			result = kg/5+1;
		}else if(kg%5 == 2 || kg%5 ==4) {
			result = kg/5+2;
		}else if(kg%5 == 0) {
			result = kg/5;
		}
		System.out.println(result);
		
	}

}
