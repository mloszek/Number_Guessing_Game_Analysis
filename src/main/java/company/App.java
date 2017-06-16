package company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws IOException, InterruptedException {

        List results = new ArrayList();

        int i = 1;

        while (i <= 50){
//            CPUGuess round = new CPUGuess();
//            CPUGuessMedian round = new CPUGuessMedian();
//            CPURandomGuess round = new CPURandomGuess();
//            UserGuess round = new UserGuess();
//            CPUGuessIncrementally round = new CPUGuessIncrementally();
//            results.add(round.getNumberOfTries());
            i++;
        }

      ResultsWriter resultsWriter = new ResultsWriter(results, "Case 10: :");



    }
}
