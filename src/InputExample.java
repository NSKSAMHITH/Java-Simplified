import java.util.Scanner;
public class InputExample {
    public static void main(String[] args){
        //How to take input from the user
        //created an object sc
        Scanner sc = new Scanner(System.in);

        System.out.println("Input your age");
        int age = sc.nextInt();

        System.out.println("enter your height in cms");
        float height = sc.nextFloat();

        System.out.println("Input your name");
        String name = sc.next();

        System.out.println("enter your statement");
        String line = sc.nextLine();

        System.out.println("Your age is " + age + " your height is "+ height);

        System.out.println("Your name is " + name);

        System.out.println("The statement made by " + name + " is " + line);
    }
}
