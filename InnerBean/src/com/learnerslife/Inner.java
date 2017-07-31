package com.learnerslife;

public class Inner {
private String house;
private String locality;
private String city;
private String state;
private String district;
private short pin ;
	public Inner() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Inner constructor");
	}
	public void sethouse(String d)
	{
		house=d;
	}
	public void setlocality(String d)
	{
		locality=d;
	}
	public void setcity(String d)
	{
		city=d;
	}
	public void setstate(String d)
	{
		state=d;
	}
	public void setdistrict(String d)
	{
		district=d;
	}
	public void setpin(String d)
	{
		pin=(short) Integer.parseInt(d);
	}
	
	
	
	//getters
	public void gethouse()
	{
		System.out.println("House:"+house);
	}
	public void getlocality()
	{
		System.out.println("locality:"+locality);
	}
	public void getcity()
	{
		System.out.println("City:"+city);
	}
	public void getstate()
	{
		System.out.println("State:"+state);
	}
	public void getdistrict()
	{
		System.out.println("District:"+district);
	}
	public void getpin()
	{
		System.out.println("Pin:"+pin);
	}
	

	public void inner()
	{
		System.out.println("Inner function running");
	}
}
