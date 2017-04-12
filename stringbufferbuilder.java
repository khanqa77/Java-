package homework;
/*
 * string is a sequeence of charecter placed in double quotes java srting is immutable.(we cannot change the state)
String buffer is almost same as sting builder including methods and constructors 
except the following every method is syncronized it is thread safety performance is slow. in string bufferbut not in string builder it is not thread safety performance is high. 
 
 */
public class stringbufferbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("hello");
		sb.append("java");
		System.out.println(sb);
		sb.insert(1,"java");
		System.out.println(sb);
		sb.replace(1, 3, "java");
		System.out.println(sb);
		sb.delete(1, 3);
		System.out.println(sb);
		sb.reverse();
		
		System.out.println(sb);

	}

}
