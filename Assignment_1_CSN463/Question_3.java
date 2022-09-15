import java.util.*;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter Second number: ");
        int y = sc.nextInt();

        int quotient = x/y;
        int remainder = x%y;

        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);

    }
}
