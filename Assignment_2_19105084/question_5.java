package Assignment_2;

import java.util.*;
public class question_5{
public static void main(String []args){

   Scanner input = new Scanner(System.in); 
   System.out.print("Enter nth number:");
   int n = input.nextInt();
      System.out.println("n" + "\t" + "n^2" + "\t" + "n^3" + "\t" + "n^4");

      for (int i = 1; i <= n; i++){
          for(int j = 0; j < 4; j++){
              System.out.print((int) Math.pow((i), (j+1))+"\t");
          }
          System.out.println();
      }
      input.close();
   }
}
