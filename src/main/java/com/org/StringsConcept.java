package com.org;

public class StringsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name1="RADHA";
String name2="ravi";
String name3="kumar";
String name4="manoj";
String name5="gopi";  // g o p i
String name6="venue";
String name7="RAVI";
System.out.println(name1.length());
System.out.println(name4.concat(name3));
System.out.println(name2.toUpperCase());
System.out.println(name1.toLowerCase());
System.out.println(name2.equals(name7));
System.out.println(name2.equalsIgnoreCase(name7));
System.out.println(name5.toCharArray());
char[] cp = name5.toCharArray();
for(int i=0;i<cp.length;i++)
{
	System.out.println(cp[i]);
}

System.out.println(name6.charAt(1));
System.out.println(name6.endsWith("p"));
System.out.println(name6.endsWith("e"));
System.out.println(name4.startsWith("M"));
System.out.println(name4.startsWith("m"));
System.out.println(name6.contains("ep"));
System.out.println(name6.contains("en"));
System.out.println(name7.hashCode());
System.out.println(name2.hashCode());
	}

}
