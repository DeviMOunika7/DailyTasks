package inheritance;
class Inherit{
	
	int b=20;
}
public class singleInheritance extends Inherit{

	int a=10;
	public static void main(String args[])
	{
	    singleInheritance i=new singleInheritance();
		System.out.println("The sum of a and b is "+(i.a+i.b));
	}
	

}
