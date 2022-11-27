package assignment_6;
import java.util.Scanner;

public class question_1 {

		public static double division(int num1, int num2) { 
			if(num1 == 0 || num2 == 0) { // if num1 or num2 equals to zero then it throws an arithmetic exception
				throw new ArithmeticException("invalid input!! numbers should not be zero");
			}
			else {
			    double ans = (double) num1 / num2;  // division of num1 and num2
			    System.out.println("Division is : " +ans);
			    return ans;
			}
		}
		
		public static int multiply(int num1, int num2) {
			
			if(num1 == 0 || num2 == 0) {  // if num1 or num2 equals to zero then it throws an arithmetic exception
				throw new ArithmeticException("invalid input!! numbers should not be zero");
			}
			else {
				int ans = num1 * num2; // multiplication of num1 and num2
			    System.out.println("Multiplication is : " + ans); 
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
				division(num1, num2);   
				
				multiply(num1, num2);
			}
			catch(ArithmeticException e) { // catch block for handling arithmetic exception 
				System.out.println(e);
			}
		}

}


