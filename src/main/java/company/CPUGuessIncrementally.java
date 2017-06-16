package company;

import java.io.IOException;
import java.util.Random;

/**
 * Created by milosz on 6/15/17.
 */
public class CPUGuessIncrementally {

    Random random = new Random();
    private int numberOfTries = 0;
    private int guessMin = 1;
    private int guessMax = 100;
    private int guess = 0;


    public int getGuessMin() {
        return guessMin;
    }

    public int getGuessMax() {
        return guessMax;
    }


    public void setGuessMin(int guessMin) {
        this.guessMin = guessMin;
    }

    public void setGuessMax(int guessMax) {
        this.guessMax = guessMax;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public CPUGuessIncrementally() throws IOException, InterruptedException {

        //Computer picks a random number from 1 to 100
        int number = random.nextInt(getGuessMax() - getGuessMin() + 1) + getGuessMin();

        do {
            numberOfTries++;
            guess++;
        }while (guess != number);


    }

}
