package test;

public class TestingOverriding extends Overridding {
	@Override
	public int sum(int a, int b){
		System.out.println("Calling sum in  TestingOverriding class");
		return a+b;
	}
	public static void main(String args[]){
		Overridding arg = new Overridding();
		System.out.println(arg.sum(10,20));
		TestingOverriding arg2 = new TestingOverriding();
		System.out.println(arg2.sum(30,40));
	}

}
