import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        //LOOPS
        //for, do while, while
        //increment
//        for(int i = 0; i <= 5; i = i + 1 ){
//            System.out.println(i);
//        }
//        //decrement
//        for (int j = 100; j >= 1; j = j/2){
//            System.out.println(j);
//        }

//        //WHILE Loop
//        int a = 50;
//        while(a >= 1){
//            System.out.println(a);
//            a/=5;
//        }

        //Do While loop
//        int k = 100;
//        do {
//            System.out.println(k);
//            k = k - 1;
//        }while(k >= 1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Keep entering a digit");
        int digit = 0;
        do{
            digit = sc.nextInt();
            System.out.print("your number is ");
            System.out.println(digit);

        }while (digit > 0);

        System.out.println("END");
    }
}
