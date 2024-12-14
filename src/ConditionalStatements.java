import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args){
        int day = 1;

        System.out.println("enter the day");

        Scanner sc = new Scanner(System.in);

        day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            default:
                System.out.println("wednesday-sunday");
        }
    }
}
