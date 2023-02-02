package com.demo;
import java.util.*;
public class PositiveOrNegative {
//no>0 => positive
public static void main(String[] args) {
int no =-10;
if(no>0) {
System.out.println("Given number is positive.");
}
else if(no<0){
System.out.println("Given no. is negative");
}else {
System.out.println("Given no. is 0");}
	
/*int i=70;
if(i>=50 && i<60)
{
System.out.println("grade d");
}
else if(i>=60 && i<70){
System.out.println("grade c");
}else if(i>=70 && i<80){
System.out.println("grade b");
}else if(i>=80 && i<100) {
System.out.println("grade a");
}else {System.out.println("invalid input");}*/
	
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int num=s.nextInt();
if(num>0) {
System.out.println("number is positive");}
else if(num<0) {
System.out.println("number is negative");}
else {System.out.println("number is zero");}
s.close();
}

}

