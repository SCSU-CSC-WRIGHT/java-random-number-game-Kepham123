import java.util.Scanner;
import java.util.Random;
public class numberGuesser {
    public static void main(String[] args){
        int guessNumber = 0;
        int attempts= 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a difficulty of easy,medium or hard");
        String difficulty = scanner.nextLine();
        if (difficulty.equals("easy")){
             guessNumber=50;
        }
        if (difficulty.equals("medium")){
             guessNumber=100;
        }
        if (difficulty.equals("hard")){
             guessNumber=500;
        }

        Random random= new Random();
        int randomNumber = random.nextInt(guessNumber) + 1;


        scanner = new Scanner(System.in);
        while(attempts>0){
            System.out.print("Guess a number between 1 and " + guessNumber);


            int guess =scanner.nextInt();
            if (guess < randomNumber){
                System.out.println("Too low! try again");
                attempts--;
                System.out.println("Attempts left:"+attempts);
            }else{
                if (guess>randomNumber){
                    System.out.println("Too high! try again!");
                    attempts--;
                    System.out.println("Attempts left:"+attempts);
                }else{
                    System.out.println("Congratulations! You have guessed it with "+attempts +" remaining.");
                    break;
                }
                




            }
            if (attempts==0){
                System.out.println("The number generated was:" + randomNumber);
                break;
            }



        }


        }

    }


