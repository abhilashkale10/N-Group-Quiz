package com.demo;

public class SwitchDemo3 {
	public static void main(String[] args) {
		String str = "burger";
		
		switch(str) {
		
		case "Pizza" : System.out.println("Pizza");
		         break;
		case "Burger" : System.out.println("Burger");
		         break;
		case "Fries" : System.out.println("Fries");
		         break;
		default : System.out.println("Invalid input");
		
		}
	}

}
