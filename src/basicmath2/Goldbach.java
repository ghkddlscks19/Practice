package basicmath2;

import java.util.Scanner;

public class Goldbach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i<T; i++) {
			int n = sc.nextInt();
			int a = n/2;
			int b = n/2;
			int m = 10000;
			if(n<4 || n>10000 || n%2!=0) {
				break;
			}
			else {
				boolean arr[] = new boolean[n+1];
				arr[0] = arr[1] = true;
				for(int j =2; j*j<=n; j++) {
					for(int k = j*j; k<=n; k+=j) {
						arr[k] = true;
					}
				}
				while(a<n && b>1) {
					if(arr[a] == false && arr[b] == false) {
						System.out.print(b+" "+a);
						System.out.println();
						break;
					}else {
						a++;
						b--;
						if(arr[a] == false && arr[b] == false) {
							if(m>a-b) {
								m = a-b;
								System.out.print(b+" "+a);
								System.out.println();
								break;
							}
						}
					}
				}
			}
		}
	}
	

}
