import java.util.*;

public class Question_4 {
    public static void Swap_using_temp(int x,int y){
        int t = x;
        x = y;
        y = t;
        System.out.println("The First number is: " + x);
        System.out.println("The Second number is: " + y);
    }
    public static void Swap_without_using_temp(int x,int y){
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("The First number is: " + x);
        System.out.println("The Second number is: " + y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter Second number: ");
        int y = sc.nextInt();

        System.out.println("Enter 0 to swap using temporary var and 1 without temporary var: ");
        

        int z = sc.nextInt();
        if(z==0){
            Swap_using_temp(x, y);
        }else{
            Swap_without_using_temp(x, y);
        }
        
    }
}
