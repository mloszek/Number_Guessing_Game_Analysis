package company;

import java.io.*;
import java.util.List;
import java.util.Random;

/**
 * Created by milosz on 6/15/17.
 */
public class CPUGuess {


    Random random = new Random();
    private int numberOfTries = 0;
    private int guessMin = 1;
    private int guessMax = 100;


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

    public CPUGuess() throws IOException, InterruptedException {

        //Computer picks a random number from 1 to 100
        int number = random.nextInt(getGuessMax() - getGuessMin() + 1) + getGuessMin();

        setGuessMax(100);
        setGuessMin(1);

        guessing(number);


    }

    public void guessing(int number) throws InterruptedException {
        numberOfTries++;
        //Thread.sleep(100);
        int guess = random.nextInt(getGuessMax() - getGuessMin() + 1) + getGuessMin();

        if (number > guess) {
            setGuessMin(guess + 1);
            guessing(number);
        } else if (number < guess) {
            setGuessMax(guess - 1);
            guessing(number);
        }

    }

}
