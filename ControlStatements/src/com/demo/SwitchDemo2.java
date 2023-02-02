package com.demo;

public class SwitchDemo2 {
	
	public static void main(String[] args) {
		char c = 'a';
		
		switch(c) {
		
		case 'a' : System.out.println("Pizza");
		         break;
		case 'b' : System.out.println("Burger");
		         break;
		case 'c' : System.out.println("Fries");
		         break;
		default : System.out.println("Invalid input");
		
		}
	}

}
