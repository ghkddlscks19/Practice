package basicmath2;

import java.util.Scanner;

public class FourthDots {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int g = 0; 
		int h = 0;
		
		if(a==c && a!=e) {
			g = e;
		}else if(a==e && a!=c) {
			g = c;
		}else if(c==e && c!=a) {
			g = a;
		}if(b==d && b!=f) {
			h = f;
		}else if(d==f && d!=b) {
			h = b;
		}else if(f==b && f!=d) {
			h = d;
		}
		System.out.println(g+" "+h);
		
		
	}

}
