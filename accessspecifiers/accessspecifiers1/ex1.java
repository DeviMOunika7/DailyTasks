package Access_Specifiers;

public class ex1 {
	public static void main(String args[])
	{
		ex1 e=new ex1();
		e.second();
	}
     public void first() {
    	 System.out.println("public");
     }
     private void second() {
    	 System.out.println("private");
     }
     void third() {
    	 System.out.println("default");
     
     }
     protected void fourth() {
    	 System.out.println("protected");
     }

}

