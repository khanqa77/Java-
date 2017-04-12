package lab;

import test.Overridding;
import test.arrayExample;

public class CallingClassFromDiffPackage {
	
	public static void main(String args[]){ 
		Overridding o = new Overridding();
		System.out.println("Calling diffrenet package method:");
		System.out.println(o.sum(12,12));
		
	}

}
