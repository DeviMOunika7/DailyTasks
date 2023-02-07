package inheritance;

public class MultilevelInheritance extends Puppy {
 
	public static void main(String args[])
	{
		MultilevelInheritance m=new MultilevelInheritance();
		m.sleep();
		m.bark();
	}

}
class Dog
{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}
class Puppy extends Dog
{
	void sleep()
	{
		System.out.println("Puppy is sleeping");
	}
}
