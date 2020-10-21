package com.syntax.class04;
import java.util.Scanner;
public class practica {
	

	 public static void main(String[]args) {
		    Scanner inp=new Scanner(System.in);
		    System.out.println("Please enter your gender: M or F");
		    String gen=inp.next();
		    
		    System.out.println("Please enter your age");
		    int age=inp.nextInt();
		    if(gen.equals("M") && age>=25) {
		    System.out.println("Man");
		  }else if(gen.equals("W") && age>=25) {
		    System.out.println("Woman");
		    if(age<25 && gen.equals("M")) {
		      System.out.println("Boy");
		  }else if(age<25 && gen.equals("W"));
		  System.out.println("Girl");
		    }
		  }
		  }
		  
		

	
		
