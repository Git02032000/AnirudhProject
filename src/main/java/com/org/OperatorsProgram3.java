package com.org;

public class OperatorsProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=30;
		int c=12;
		int d=18;
		int e=28;
		int f=20;
		int g=35;
		int h=18;
		System.out.println((a>b)&&(d>f)); //false&&false
		System.out.println((d<=g)&&(b>=g)); //true&&false
		System.out.println((d<=g)&&(c<=h));//true&&true
		
		//Logical OR
		System.out.println((d<=g)||(c<=h)); //true||true--true
		System.out.println((d<=g)||(b>=g)); //true||false--true
		System.out.println((a>b)||(d>f)); //false||false
		
	}

}
