package javaprograms;

class Parent 
{
void m1()
	{
	System.out.println("parent method");
	}
	Parent()
	{
		System.out.println("0 arg constructor");
	}
}
class child extends Parent
{
	void m1()
	{
  System.out.println("child method");
	}
	void m2()
	{
		this.m1();
		super.m1();
System.out.println("child 2 method");
		}
		child()
	{
		System.out.println("child constructor");
	}
	
	public static void main(String[] args) 
	{
		new child().m2();//object created and method called
	}
}
