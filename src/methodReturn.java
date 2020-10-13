
public class methodReturn {

	// method without returning value
	
	 public void getData() {
		 System.out.println("This method not returning value");
	 }
	
	 // method returning int value
	 
	 public int getInt() {
		 System.out.println("This method returning int value");
		 return 5;
	 }
	
	public String getString() {
		System.out.println("This method returning string value");
		return "PASS";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         methodReturn m= new methodReturn();
         m.getData();
		 m.getInt(); 
	     System.out.println(m.getInt()); 
		 m.getString();
        System.out.println(m.getString());
	 // Calling method from other class
        Method m1= new Method();
        m1.ValidateHeaher();
	}

}
