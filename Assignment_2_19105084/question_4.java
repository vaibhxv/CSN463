package Assignment_2;

public class question_4 {
    public static void main(String[] args) {
        double people=80000;
        double interest=0.05;
        int count=0;

        while(people<=150000) {
            people= people + (people*interest);
            System.out.println(people);
            count++;
        }
        System.out.println("Years to reach target population is: " + count);
    }
}
