package company;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by milosz on 6/15/17.
 */
public class UserGuess {

    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int numberOfTries = 0;
    int cpuNumber = random.nextInt(100) + 1;

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public UserGuess() throws IOException {


        System.out.println("Guess which number from 1 to 100 i am thinking of? ");

        guessing();



    }

    public void guessing() {
        numberOfTries++;
        int answer = 0;
        try {
            answer = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println();
        }

        if (answer == cpuNumber) {
            System.out.println("You guessed after "
                    + getNumberOfTries() + " tries");
        } else if (answer > cpuNumber) {
            System.out.println("Less");
            guessing();
        } else if (answer < cpuNumber) {
            System.out.println("More");
            guessing();
        }


    }

}
