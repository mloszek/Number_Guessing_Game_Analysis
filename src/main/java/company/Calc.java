package company;

import java.io.*;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

/**
 * Created by milosz on 6/16/17.
 */
public class Calc {

    public void setLength ( int length){
        this.length = length;
    }

    int length;
    public Calc() {

    }
    public void Calculate(File file) throws IOException {

        FileInputStream fileInputStream = null;


        /**the purpose of this class is to calculate average and standard deviation of guessing results, but
        it pretty much calculates them from any string of numbers with space in between*/
//        String data = "1 2 3 ";

        fileInputStream = new FileInputStream(file);
        BufferedReader buffRd = new BufferedReader(new InputStreamReader(fileInputStream));

        String data = buffRd.readLine();

        String [] singleNumbersChars = data.split(" ");
        int [] singleNumbers = new int[singleNumbersChars.length];

        for (int i = 0; i < singleNumbersChars.length; i++) {
            singleNumbers[i] = Integer.parseInt(singleNumbersChars[i]);
            System.out.print(singleNumbers[i] + " ");
        }

        //average number of tries
        float average = (sumOfElements(singleNumbers)/(float)singleNumbers.length);
        System.out.println("\naverage: " + average);

        //standard deviation
        float stdDev = stdDev(singleNumbers, average);
        System.out.println("standard deviation: " + stdDev);


    }

    public static int sumOfElements(int [] results){
        int sum = 0;
        for (int i: results) {
            sum += i;
        }
        return sum;
    }

    public static float stdDev(int [] elements, float average){

        float sum = 0;
        for (int i = 0; i < elements.length; i++) {

            float pwdEl = (float) Math.pow(elements[i]-average, 2);
            sum += pwdEl;

        }

        float pwdStdDev = sum/(float)elements.length;
        float stdDev = (float) Math.sqrt(pwdStdDev);

        return stdDev;
    }
}
