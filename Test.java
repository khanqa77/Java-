package javaprograms;

public class Test 
{
	void m1(int a, char ch )//local variables, instance method
	{
		System.out.println("m1 method");
		System.out.println(a);
		System.out.println(ch);
	}	
	static void m2(String str, double d )// static method
	{
		System.out.println("m2 method");
		System.out.println(str);
		System.out.println(d);
	}
	public static void main(String[] args)
	{
	Test t = new Test();
	t.m1(10,'a');// calling m1 method using object
	Test.m2("khan", 10.5);// calling m2 method using class name
	
	}
}
