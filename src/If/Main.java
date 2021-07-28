package If;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


		   public static void main(String[] args) {
		      Scanner sc=new Scanner(System.in);
		      int n= sc.nextInt();
		      String st []= new String[n];
		      
		      int sum=0;
		      String a=sc.next();
		      
		      for(int i=0;i<st.length;i++) {
		         
		         
		         st[i]=a;
		         int x=Integer.parseInt(st[i]);
		         sum+=x;
		         
		         
		         
		      }
		      
		      System.out.println(sum);
		      
		   }
		}
		      

