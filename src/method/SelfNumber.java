package method;

public class SelfNumber {
	
	
	public static void main(String[] args) {
		
		boolean[] self = new boolean[10001];
		
		for(int i=1; i<10001; i++) {
			if(d(i) < 10001) {
				self[d(i)] = true;
			}
		}
		for(int i=1; i<10001; i++) {
			if(self[i]==false) {
				System.out.println(i);
			}
		}
		
		
	
	}
	public static int d(int n) {
		int num = n;
		while(n!=0) { 
			num += n%10;
			n/=10;
			
			
		}
		return num;
	}

}
