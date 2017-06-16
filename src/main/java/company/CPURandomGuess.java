package company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by milosz on 6/15/17.
 */
public class CPURandomGuess {

    List usedNumbers = new ArrayList();
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

   public int getNumberOfTries() {
        return numberOfTries;
    }


    public CPURandomGuess() throws IOException, InterruptedException {

        //Computer picks a random number from 1 to 100
        int number = random.nextInt(getGuessMax() - getGuessMin() + 1) + getGuessMin();

        guessing(number);


    }

    public void guessing(int number) throws InterruptedException {
        numberOfTries++;
//        Thread.sleep(100);
        int guess = random.nextInt(getGuessMax() - getGuessMin() + 1) + getGuessMin();

//        if (usedNumbers.contains(guess)){
//            numberOfTries--;
//            guessing(number);
//        }else if (number != guess){
//            usedNumbers.add(guess);
//            guessing(number);
//        }

        if (number != guess){
            usedNumbers.add(guess);
            guessing(number);
        }


    }

}
