package com.sample;
public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.print("Pattern1");
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
        System.out.println("Pattern2");
        for(int i=1;i<=5;i++) {
        	for(int j=4;j>=i;j--)
        	{
        		System.out.print(" ");
        	}
        	for(int k=1;k<=i;k++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
        	
	}
}
