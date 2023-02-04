package org.number;

import java.util.Scanner;

public class ReverseNumber {
	
	
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = input.nextInt();
	        int reverse = 0;
	        int original = num;
	        
	        while (num != 0) {
	            int digit = num % 10;
	            reverse = reverse * 10 + digit;
	            num /= 10;
	        }
	        
	        
	        System.out.println("if number is even");
	        
	        System.out.println("if number is odd");
//<<<<<<< HEAD
//	       
//=======
//	        
//>>>>>>> 25a4b6bad82f389a397b86c5872b548ffa1c8c22
//	        
	        
	        if (original == reverse) {
	            System.out.println(original + " is a reverse number.");
	        } else {
	            System.out.println(original + " is not a reverse number.");
	        }
	    }
	}

