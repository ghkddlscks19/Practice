package basicmath2;

import java.util.Scanner;

public class TaxicabGeometry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double e = Math.PI;
		
		System.out.printf("%.6f\n",e*r*r);
		System.out.printf("%.6f",r*r*2);
	}

}
