package lt.vcs;

/**
 * 5b. Realizuoti 4a užduotį panaudojant metodą
 * kurio parametrai būtų masė ir ūgis,
 * o grąžinama reikšmė, kūno masės indeksas.
 */
public class App5b {

    public static void main(String[] args) {
//        KMI = masė (kg) / (ūgis(m))^2
        double myKmi = countKmi(100, 1.88);
        double myKmi1 = countKmi(80, 1.90);
        double myKmi2 = countKmi(75, 1.70);
        System.out.println("My kmi: " + myKmi);
    }

    public static double countKmi(double mass, double height) {
        double kmi = mass / (height * height);
        return kmi;
    }


}
