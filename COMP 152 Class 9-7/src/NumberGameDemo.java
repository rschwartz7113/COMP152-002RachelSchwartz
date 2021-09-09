import java.util.Random;
import java.util.Scanner;

public class NumberGameDemo {
    public static void main(String[] args){
        var numberGen = new Random();
        var hiddenNumber = numberGen.nextInt(10)+1;
        var commandLineReader = new Scanner(System.in);
        System.out.print("Guess a number from 1 to 10:");
        var userGuess = commandLineReader.nextInt();
        while (true){
            if (hiddenNumber == userGuess) {
                System.out.println("You guessed it! " + hiddenNumber + " was the right one");
                break;
            }
            else{
                System.out.println("Sorry " + userGuess + " was not my number");
                if (userGuess - hiddenNumber >0)
                    System.out.println("Your guess was too high!");
                else
                    System.out.println("Your guess is too low!");
                System.out.println("Try again");
                userGuess = commandLineReader.nextInt();

        }
    }
}}
