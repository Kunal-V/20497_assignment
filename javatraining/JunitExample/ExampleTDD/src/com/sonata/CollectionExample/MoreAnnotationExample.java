package com.sonata.CollectionExample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoreAnnotationExample {

@BeforeClass	
public static void beforeClass() {
	System.out.println("In before Class");
}

@AfterClass
public static void afterclass() {
	System.out.println("In after class");
}
@Before
public void before() {
	System.out.println("In before");
}

@After
public void after() {
	System.out.println("In after");
}
@Test
public void testCase1() {
	System.out.println("in test case1");
}

@Test
public void testCase2() {
	System.out.println("in test case2");
}



}
