
public class stringReversePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Reverse String
		
		String s = "Java";
		String t = "";
		for (int i=s.length()-1;i>=0;i-- )
		{
			System.out.println(s.charAt(i));
			
 // check palindrome or not by concentante  
			t = t+ s.charAt(i);
		}

		System.out.println(t);
 // check condition if palindrom or not
		
		if (s==t)
		{
			System.out.println("String is palindrome:"+t);
		}
		else {
			System.out.println("String is not palindrome:"+t);
		}
	}

}
