package com.sonata.TestSuitExample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class testUnit {

	@RunWith(Suite.class)
	@Suite.SuiteClasses({
		testClass.class,
		testClass2.class)}

	}

