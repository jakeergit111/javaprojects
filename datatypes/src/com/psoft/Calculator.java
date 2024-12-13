package com.psoft;

public class Calculator {
	
   static int x = 11;
	int y ;
	
	
	
	void add () {
		
		int  z = 33;
		System.out.println(z+y);
		}
	
	static void sub() {
	
	int a=88;
	System.out.println(a-x);
	}
	
	void mul () {
		
		System.out.println(x+y); }
	
	public static void main(String[] args) {
		
		sub();
		
		Calculator cal = new Calculator();
		cal.mul();
		cal.add();
		
		System.out.println(x+cal.y);
		
	}
	
	
	}
