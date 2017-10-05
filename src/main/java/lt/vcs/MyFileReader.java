package lt.vcs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MyFileReader {

    public ArrayList<String> read(String fileName) throws IOException {
        ArrayList<String> lines = new ArrayList();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            String line = br.readLine();
            while (line != null) {
                if (line.length() > 0) {
                    lines.add(line);
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
        return lines;
    }

}
