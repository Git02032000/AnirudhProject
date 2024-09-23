package com.ng;

import org.testng.annotations.Test;

public class FruitsTest {
	@Test(priority=3)
public void grapes()
{
	System.out.println("grapes");
}
	@Test(priority=2)
public void mango() 
{
System.out.println("mango");	
}
	@Test(priority=4)
public void gauva()
{
	System.out.println("gauva");
}
	@Test(priority=1)
	
public void orange()
{
	System.out.println("orange");
}
}

