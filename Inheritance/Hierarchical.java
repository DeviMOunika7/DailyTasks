package inheritance;

public class Hierarchical {
  public static void main(String args[])
  {
	  Hihello h=new Hihello();
	  h.first();
	  h.second();
	  h.third();
  }
	public Hierarchical() {
		// TODO Auto-generated constructor stub
	}

}
class Hi
{
	void first()
	{
		System.out.println("hi ,This is parent");
	}
}
class Hello extends Hi{
	void second() {
		System.out.println("hi,This is child");
	}
}
class Hihello extends Hello{
	void third() {
		System.out.println("hi,This is subchild");
	}
}
