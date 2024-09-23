package com.org;

public class StringConcpet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//What is the difference between == operator and .equals()
		String name1="anirudh";
		String name2=new String("anirudh");
		String name3="anirudh";
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		System.out.println(name1.equals(name2));
	}

}
