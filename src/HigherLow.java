import java.util.Random;
import java.util.Scanner;

public class HigherLow {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int targetNumber = generator.nextInt(10) + 1;

        int userGuess = 0;
        boolean done = false;

        do {
            IO.print("Guess a number between 1 and 10: ");

            if (in.hasNextInt()) {
                userGuess = in.nextInt();

                if (userGuess >= 1 && userGuess <= 10) {
                    done = true;
                } else {
                    System.out.println("Your guess is " + userGuess +
                            ", which is out of range (1-10).");
                }
            } else {
                String trash = in.next();
                IO.println("You must enter an integer, not: " + trash);
            }

        } while (!done);

        IO.println("Valid guess entered: " + userGuess);

        in.close();
    }
}
