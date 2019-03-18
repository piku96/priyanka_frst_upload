package com.packagee;

import java.util.Scanner;



public class RevString {


	/*public static void main(String[] args) 
	{
	Scanner scn=new Scanner(System.in);
	System.out.print("enter the string");
String s=scn.nextLine();
String temp="";
	for(int i=s.length()-1;i>=0;i--)
	{
		temp+=s.charAt(i);
	}
	
System.out.print(temp);
		
		
	}*/
	
		
		public static void main(String[] args) {
			int a[]= {1,2,3,4,5};
			int temp;
			System.out.println("before swaping");
			for(int i=0;i<a.length;i++) {
				System.out.print(" "+a[i]);
			}
			
		
			for(int i=0;i<a.length/2;i++) {
				temp=a[i];
				a[i]=a[a.length-1-i];
				a[a.length-1-i]=temp;
				
		}
			System.out.println("after swaping");
			for(int i=0;i<a.length;i++) {
				System.out.print(" "+a[i]);
			}
	}
		
	}

	


	