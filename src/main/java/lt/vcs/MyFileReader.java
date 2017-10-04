package lt.vcs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

    public String[] read() throws IOException {
        String[] lotsOfLines = new String[1000];
        BufferedReader br = new BufferedReader(new FileReader("names.txt"));
        try {
            String line = br.readLine();
            int i = 0;
            while (line != null) {
                if (line.length() > 0) {
                    lotsOfLines[i] = line;
                }
                line = br.readLine();
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
        return lotsOfLines;
    }

}
