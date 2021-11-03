package com.sonata.AnnotationExample;

class ShowOne{

	public void show() {
		System.out.println("its my ShowOne");
	}
}

class ShowTwo extends ShowOne {
	@Override
	public void show() { 
		super.show();
		System.out.println("its my showTwo ");
	}
}
public class MyAnnotation {
	public static void main(String[] args) {
		ShowTwo s1 = new ShowTwo();
		s1.show();
	}
}
