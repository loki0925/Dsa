package com.optimum;

import java.util.Scanner;

public class Pst {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("enter Start int");
	   int start = sc.nextInt();
	   
	   System.out.println("enter pivot int");
	   int pivot = sc.nextInt();
	   
	   System.out.println("enter end int");
	   int end = sc.nextInt();
	   
	   for(int i=pivot;i >= start;i--) { 
		   System.out.print(i+" ");
	   }
	   for(int i=pivot+1;i <= end;i++) {
		   System.out.print(i+" ");
	   }
	   System.out.println();
	   
	   
	   
	}
	
}
