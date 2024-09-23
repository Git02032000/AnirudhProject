package com.org;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("Rama");
al.add("krishna");
al.add("Hari");
al.add("Gopi");
al.add("murali");
System.out.println(al);
al.add("Gopi");
al.add("Ravi");
al.add("Venue");
System.out.println(al.size());
System.out.println(al.get(3));
Iterator<String> it = al.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
}

}
