import java.util.Scanner;
import java.util.Random;
public class GuessMyNumber {

    public static void GuessNumber(){
        Random random = new Random();

        int guessedNumber = random.nextInt(100) + 1;
        System.out.println(guessedNumber);

        System.out.println("Enter the number from 1 - 100");
        Scanner sc = new Scanner(System.in);

        int userGuessed;

        while(true){
            userGuessed = sc.nextInt();

            if (userGuessed == -1){
                System.out.println("exiting the game");
                break;
            }
            else if (userGuessed > guessedNumber ){
                System.out.println("the number is big");
            }
            else if(userGuessed < guessedNumber){
                System.out.println("the number is small");
            }
            else{
                System.out.println("Yay, you guessed the number correctly");
                break;
            }
        }
        System.out.println("the number that I guessed is " + userGuessed );
        }

    public static void main(String[] args){
        GuessNumber();
    }
}
