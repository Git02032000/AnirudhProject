package com.ng;

import org.testng.annotations.Test;

public class SuperMarketTest {
@Test(dependsOnMethods= {"grapes"})
	public void mango()
	{
	System.out.println("mango");
	}
@Test(dependsOnMethods={"dal"})
public void grapes()
{
	System.out.println("grapes");
}
@Test(dependsOnMethods= {"mango"})
public void carrot()
{
	System.out.println("carrot");
}
@Test
public void dal()
{
	System.out.println("dal");
}
            
}
