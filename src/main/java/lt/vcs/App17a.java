package lt.vcs;

import java.io.IOException;

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
        String[] lines = reader.read();

        for (int i = 0; i < lines.length; i++) {
            System.out.println("Line: " + lines[i]);
        }
    }
}
