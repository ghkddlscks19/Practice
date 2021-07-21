package If;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("정수 10개 입력하시오");
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int x[]=new int[10];
        int cnt=1;
        
        for(int t=0;t<10;t++) {
           arr[t]=sc.nextInt();
           x[t]=arr[t]%42;   
        }
        System.out.println(Arrays.toString(x));
        
        for(int i=0;i<1;i++) {
        for(int j=1;j<10;j++){
           
           if(x[i]!=x[j]) {
              cnt++;
           }
        }
        }   
        
        System.out.println(cnt);
           
		
		
			
		

	}
	
}
