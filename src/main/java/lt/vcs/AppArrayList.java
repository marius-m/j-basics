
package lt.vcs;

import java.util.ArrayList;

public class AppArrayList {

    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("Jonas");
        myArrayList.add("Petras");

        myArrayList.remove(0);

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println("Our number: " + myArrayList.get(i));
        }
        System.out.println("Array size: " + myArrayList.size());
    }
}
