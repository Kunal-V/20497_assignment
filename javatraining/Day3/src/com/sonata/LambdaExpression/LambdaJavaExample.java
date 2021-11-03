package com.sonata.LambdaExpression;

@FunctionalInterface
interface simple {
	void sum(int a);
}
public class LambdaJavaExample {

	public static void main(String[] args) {
		
		simple s1= (int a) -> { System.out.println("Welcome to Lambda" + a); };
		s1.sum(10);
		
		MyFunctionalInterface x1 = () -> { System.out.println("My functional interface"); };
		x1.m1();
		x1.m2();
	}

}
