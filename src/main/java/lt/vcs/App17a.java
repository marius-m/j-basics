package lt.vcs;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 17a. Tekstiniame faile į kiekvieną eilutę yra surašyti du skaičiai,
 * pirmas iš jų nurodo automobilio suvartotą kuro kiekį tam tikram atstumui įveikti,
 * antras - nuvažiuotą atstumą. Parašyti programą
 * kuri paskaičiuotų kokios yra vidutinės automobilio kuro sąnaudos.
 * Turėtų būtų nuskaitomas duomenų failas ir atvaizduojamos paskaičiuotos vidutinės kuro sąnaudos.
 */
public class App17a {

    public static void main(String[] args) throws IOException {
        MyFileReader reader = new MyFileReader();
        ArrayList<String> lines = reader.read("names.txt");

        ArrayList<Gas> gases = new ArrayList<Gas>();
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            String[] splitLine = line.split(" - ");
            Gas gas1 = new Gas(splitLine[0], splitLine[1]);
            gases.add(gas1);
        }

        double total = 0;
        for (int i = 0; i < gases.size(); i++) {
            double calculatedSize = gases.get(i).calculate();
            System.out.println("Average of one gas: " + calculatedSize);
            total += calculatedSize;
        }
        double average = total / gases.size();

        System.out.println("Average: " + average);
    }
}
