
public class stringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	// String- it is one of pre-built class in java
	/* 1. String literal
	 * 2. By creating object of string
	 */
		
		String a= "Hello";
		String b= "Hello";
		String c= "Java/Training";
		
	// In above case, b string will always refer "Hello" of string a and wont create new allocation
		
		String b1= new String("Hello");

		// In above case, b will create another object with Hello
		
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("l"));
		System.out.println(c.substring(1, 5));
		System.out.println(c.concat(" For New learner"));
		
		// spilit string
		String arr[] = c.split("/");
	   System.out.println(arr[0]);
	   System.out.println(arr[1]);
	   
		
		
	}

}
