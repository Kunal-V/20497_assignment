
package com.springcore.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcore.CalculatorInterface;

//@Component
public class UseCal implements CalculatorInterface {

		//@Autowired
		CalculatorInterface Calculator;


		public CalculatorInterface getCalculator() {
			return Calculator;
		}

		public void setCalculator(CalculatorInterface calculator) {
			Calculator = calculator;
		}

		@Override
		public int calladd(int n1, int n2) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int callmul(int n1, int n2) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int calldiv(int n1, int n2) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int callsub(int n1, int n2) {
			// TODO Auto-generated method stub
			return 0;
		}


		
	}

	
	
	
