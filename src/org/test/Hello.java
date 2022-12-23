package org.test;

public class Hello {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		int b[]= {10,20,30,40,50,60};
		int l= b.length;
		System.out.println(l);
		System.out.println(b.length);
		System.out.println(a.length);
		
		
		System.out.println(a);
		System.out.println(a[4]);
		
		
		System.out.println("Normal for loop....");
		for(int i=1; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Enhanced for loop....");
		 for(int x:b) {
			 System.out.println(x);
		 }
	}
	
	
}
