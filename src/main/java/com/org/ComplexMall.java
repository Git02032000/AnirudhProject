package com.org;

public class ComplexMall extends ShopingMall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexMall cm=new ComplexMall();
		cm.grt();
		cm.chennaiShopingMall();
		cm.goldOrnaments();
	}
	public void grt()
	{
		System.out.println("Its famous goldshop");
	}
	public void studio()
	{
		System.out.println("Best photo studio");
	}
	@Override
	public void goldOrnaments() {
		// TODO Auto-generated method stub
		System.out.println("Kazahna gold ornaments");
	}
	@Override
	public void rubberShops() {
		// TODO Auto-generated method stub
		System.out.println("Shoes and belts shops");
	}
	

}
