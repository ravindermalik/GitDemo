
public class nestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Nested loop example
		for(int i=0;i<=4;i++) /// outer loop, it will run 4 times
		{
			System.out.println("Outer loop started");
			
		   for(int j=i;j<=4;j++) // inner loop, it will run 4 time
		   {
			  System.out.println("inner loop");
		   }
		  
		   System.out.println("outer loop finished");
		}
		
	}

}
