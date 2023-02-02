package com.demo;

//1) Registration : age> 18
//2) medical : hb>12
//3)blood donate.
public class BloodDonationCamp {
	
	public static void main(String[] args) {
		//1)Registration process
		int age = 15;
		if(age>18) {
			//2) medical checkup 
			int hb =11;
			if(hb>12) {
				System.out.println("Student is eligible for blood donation..");
			}else {
				System.out.println("Student is not eligible becoz hb < 12");
			}
		}else {
			System.out.println("Student is not eligible becoz age< 18");
		}
		
	}
     
}
