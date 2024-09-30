package com.cjc.locators;

public class A {
	static
	{
		System.out.println("static block");
	}
	public static void main(String[] args) {
		System.out.println("m3");
		m1();
	}
	static public void m1()
	{
		System.out.println("m1");
	}
	public void m2()
	{
		System.out.println("m2");
	}
	public void pooja()
	{
		System.out.println("pooja");
	}
	public void kiran()
	{
		System.out.println("kiran");
	}
	public void ki()
	{
		System.out.println("ki");
	}
}
