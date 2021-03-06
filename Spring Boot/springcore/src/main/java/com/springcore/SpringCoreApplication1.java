package com.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreApplication1 {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans1.xml");
		UseCalInterface test1 = (UseCalInterface)ctx.getBean("useCal");
		System.out.println(test1.useAdd(10,20));
		System.out.println(test1.useMul(10,20));
		System.out.println(test1.useDiv(10,20));
		System.out.println(test1.useSub(10,20));
	}

}


