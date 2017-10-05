package lt.vcs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 13a. Faile kiekvienoje eilutėje surašytas žmogaus vardas ir amžius.
 * Parašyti programą kuri nuskaitytų duomenis į HashMap tipo
 * duomenų struktūrą, tuomet leistų vartotojui įvesti norimą vardą,
 * ir jei šis buvo duomenų faile, atvaizduoti to žmogaus amžių.
 */
public class App13a {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        MyFileReader fileReader = new MyFileReader();
        ArrayList<String> lines = fileReader.read("name_age.txt");

        HashMap<String, Integer> nameMap = new HashMap<String, Integer>();
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            if (line.contains("-")) {
                line = line.replaceAll(" ", "");
                String[] lineSplit = line.split("-");
                String name = lineSplit[0];
                int age = Integer.parseInt(lineSplit[1]);
                nameMap.put(name, age);
            }
        }
        while (true) {
            System.out.println("Please enter name");
            String inputName = scanner.nextLine();
            if (inputName.equals("exit")) {
                break;
            }
            if (nameMap.containsKey(inputName)) {
                int age = nameMap.get(inputName);
                System.out.println("User " + inputName + " = " + age);
            } else {
                System.out.println("Sorry, no such name!");
            }
        }
    }
}
