package lt.vcs;

import java.util.HashMap;

public class AppMaps {

    public static void main(String[] args) {
        HashMap<String, Person> myMap = new HashMap<String, Person>();

        myMap.put("Jonas", new Person());
        myMap.put("Petras", new Person());

        System.out.println(myMap.get("Jonas"));

    }
}
