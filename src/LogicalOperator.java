import java.util.Scanner;

public class LogicalOperator
{
    public static void main(String[] args){
//        int a = 5;
//        int b = 6;
//
//        //AND operator
//        if (a > 1 && b < 1){
//            System.out.println("Bpth are greater than 1");
//        }
//        else{
//            System.out.println("both are not less than 1");
//        }
//
//        //OR operator
//        if (a > 1 || b < 1){
//            System.out.println("Atleast one value or more greater than 1");
//        }
//
//        //NOT OPERATOR
//        boolean isAdult = false;
//        if (!isAdult){
//            System.out.println("is Adult");
//        }
//        else{
//            System.out.println("not Adult");
//        }

        Scanner sc = new Scanner(System.in);
        //pen = 10, notebook = 20
        System.out.println("How much cash do you have?");
        int cash = sc.nextInt();

        if (cash < 10){
            System.out.println("cannot buy anything");
        }
        else if(cash > 9 && cash < 15 ){
            System.out.println("can get 1 things");
        }
        else{
            System.out.println("can get both the things");
        }
    }
}
