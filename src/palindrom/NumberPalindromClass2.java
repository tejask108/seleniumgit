package palindrom;

public class NumberPalindromClass2 {

	public static void main(String[] args) {
		
		int a;
		int sum=0;
		int lastdigit;
		
		int inputno=1234;
		a=inputno;
		
		while(a>0) {
		
			lastdigit=a%10;
			sum=(sum*10)+lastdigit;
			
			a=a/10;
			
		}
		
		if (sum==inputno) 
			System.out.println("no is palindrome");
			
			else 
			
			System.out.println("no is not palindrome");
	
	
}
}