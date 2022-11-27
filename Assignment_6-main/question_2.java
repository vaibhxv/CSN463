package assignment_6;
import java.util.Scanner;

public class question_2 {
			
		public static int addition(int num1, int num2) {
			if(num1 < 0 || num2 < 0) {  // if num1 or num2 are negative then it throws an arithmetic exception
				throw new ArithmeticException("Inavlid input!! numbers should be not be negative");
			}
			else {
				int ans = num1 + num2;  // addition of num1 and num2
				System.out.println("Addition is : " + ans);
				return ans;
			}
		}
		
		public static int subtraction(int num1, int num2) {
			if(num1 < 0 || num2 < 0) {  // if num1 or num2 are negative then it throws an arithmetic exception
				throw new ArithmeticException("Inavlid input!! numbers should be not be negative");
			}
			else {
				int ans = num1 - num2;  // subtraction of num1 and num2
				System.out.println("Subtraction is : " + ans);
				return ans;
			}
		}
		public static void main(String[] args) {
			
			Scanner scn = new Scanner(System.in);
			System.out.print("Input first number : ");
			int num1 = scn.nextInt();
			
			System.out.print("Input second number : ");
			int num2 = scn.nextInt();
			
			try {  // try block to monitor for errors
				addition(num1, num2);
				
				subtraction(num1, num2);
			}
			catch(ArithmeticException e) { // catch block for handling arithmetic exception 
				System.out.println(e);
			}
		}
	}

