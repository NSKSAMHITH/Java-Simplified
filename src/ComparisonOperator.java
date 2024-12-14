import java.util.Scanner;
public class ComparisonOperator {
    public static void  main(String[] args){
        //comparison operator
        //a==b
        //a!=b
        //a>b, a<b, a<=b, a>=b

        //conditional statements
        //if else statements, while

//        boolean isSunUp = false;
//        if (isSunUp == true) {
//            System.out.println("it is a day");
//        }
//        else{
//            System.out.println("it is night");
//        }
//

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");

        int age = sc.nextInt();

        if (age > 18){
            System.out.println("the individual is Major, he can drive the motorcycle");
        }
        else{
            System.out.println("the individual is minor, he can't drive the motorcycle");
        }

    }
}
