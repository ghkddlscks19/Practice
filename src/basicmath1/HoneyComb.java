package basicmath1;

import java.util.Scanner;

public class HoneyComb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 1;
		int sum = 6;
		int result = 1;
		
		while(true) {
			if(n<=cnt) {
				break;
			}
			cnt += sum;
			sum += 6;
			result++;
		}
		System.out.println(result);

	}

}
