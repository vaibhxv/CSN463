package Assignment_2;
import java.util.*;


public class question_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        double x = sc.nextFloat();
        if(x>80 && x<90) {
            x=x+5;
            System.out.println("New number is: " + x);
        }
        else {
        System.out.println("Unchanged number is: " + x);
        }


        sc.close();
    }
}
