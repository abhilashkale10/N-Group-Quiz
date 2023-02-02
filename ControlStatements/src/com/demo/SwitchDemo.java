package com.demo;

public class SwitchDemo {
	
	public static void main(String[] args) {
		final int a=10, b=20;
		switch(b) {
		case 10 : System.out.println("Pizza");
		         break;
		        
		case 20 : System.out.println("Burger");
		         break;
		
		case 128 : System.out.println("Fries");
		         break;
		         
		case 4 : System.out.println("food");
		         break;
		default : System.out.println("Invalid input");
		         
		}
		}
	}


