import java.util.*;


public class Question_1{
    public static int addition(int x,int y){
        return x+y;
    }
    public static int subtraction(int x,int y){
        return x-y;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();
        int add = addition(x,y);
        System.out.println("Addition of two number is : " + add);
        int sub = subtraction(x,y);
        System.out.println("Subtraction of two number is : "+ sub);
    }
}