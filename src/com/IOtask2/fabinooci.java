package com.IOtask2;

import java.io.Serializable;

public class fabinooci implements Serializable
{
	
	private Integer a;
	private Integer b=1;
	private Integer c;
	
	public fabinooci(Integer a) {
		// TODO Auto-generated constructor stub
		this.a=a;
	}
	public void task1() {
		
		for(Integer i=0; i<=20; i++)
		{
			c= a+b;
			a=b;
			b=c;
			System.out.print(a+", ");
		}
	
	}
	
	
}
