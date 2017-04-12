package javaprograms;
class job{}
class emp{}
class college{}
class student{}

 class Test1 
{
  void m1(job x, emp e)
  {
	  System.out.println("method m1");
  }
  static void m2 (college c,student s)
  {
	  System.out.println("method m2");
  }
 public static void main(String[]args)
 {
	Test1 t = new Test1();
	job x = new job();
	emp e = new emp();
	t.m1(x, e);// t.m1(new job(), new emp());
	
	college c = new college();
	student s = new student();
	Test1.m2(c, s);// Test1.m2(new college(),new student());			
}
 
}
