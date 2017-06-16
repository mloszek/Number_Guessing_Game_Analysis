package company;

import java.io.*;
import java.util.List;

/**
 * Created by milosz on 6/15/17.
 */
public class ResultsWriter {

    FileOutputStream fileOutStr = null;

    public ResultsWriter(List list, String description) throws IOException {

        fileOutStr = new FileOutputStream("newResults.txt");
        BufferedWriter buffWr = new BufferedWriter(new OutputStreamWriter(fileOutStr, "UTF-8"));

        /* allows to add lines to existing file*/
//        buffWr.write(description);
//        buffWr.newLine();

        for (int i = 0; i < list.size(); i++) {

            String result = String.valueOf(list.get(i));
            buffWr.write(result);
            buffWr.write(' ');

        }
//        buffWr.newLine();
        buffWr.close();

    }
}
