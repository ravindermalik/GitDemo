
public class nestedLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // program to write below format
	// 1 2 3 4
	// 5 6 7
	// 8 9
	// 10
		int k=1;
		for(int i=0;i<5;i++) 
		{
			System.out.println("Outer loop started");
	       for(int j=1;j<5-1;j++)
	    	   System.out.print(k);
	       System.out.println("/t");
	           k++;
		}	
		
	  System.out.println("outer loop finished");
	}

}
