package com.org;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> hs=new HashSet<String>();
String abc[] = null;
hs.add("Rama");
hs.add("krishna");
hs.add("murali");
hs.add("gopi");
System.out.println(hs);
hs.add("murali");
hs.add("ravi");
hs.add("venue");
System.out.println(hs);
Iterator<String> it = hs.iterator();
for(int i=0;i<hs.size();i++)
{
	
}
for(int i=0;i<abc.length;i++)
{
	System.out.println(abc[i]);
}
	}

}
