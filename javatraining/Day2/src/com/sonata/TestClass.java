package com.sonata;

import com.sonata.pack.PackageExample;

public class TestClass  extends PackageExample{

	public static void main(String[] args) {
	
		PackageExample p1 = new PackageExample();
		p1.div(10,2);
		
		TestClass s1 = new TestClass();
		s1.div(10, 2);
		s1.mul(10,20);

	}

}
