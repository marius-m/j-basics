package lt.vcs;

import java.util.Scanner;

/**
 Program emulates how ATM machine works.

 ATM machine has two states, logged in and not logged in.

 Not logged in
     Will as user to "authenticate itself" (for now leave only one username/password)
     If authentication fails, ask user to try again.
     If authentication succeeds, change app state to "Logged in"

 Logged in
     User can see the current ballance of his card (eg.: 200$)
     User can withdraw money (cannot withdraw more than there is on his current ballance)
     User can bring in money.
     User can log out of the account (change app state to "Not logged in")
 */
public class AppATM {

    public static Scanner scanner = new Scanner(System.in);

    public static String validUsername = "Jonas";
    public static String validPin = "1234";
    public static double currentBalance = 1000.333333;

    public static void main(String[] args) {
        do {
            System.out.println(" Please enter username");
            String username = scanner.nextLine();
//            String username = "Jonas"; // todo: test data
            System.out.println(" Please enter pin number");
            String enteredPin = scanner.nextLine();
//            String enteredPin = "1234"; // todo: test data

            if (username.equals(validUsername) && enteredPin.equals(validPin)) {
                System.out.println("Logged in");
                int menuSelection = 0;
                while (menuSelection != 4) {
                    menuSelection = doMenu();
                    switch (menuSelection) {
                        case 1: {
                            doBalance();
                            break;
                        }
                        case 2: {
                            removeMoney();
                            break;
                        }
                        case 3: {
                            addMoney();
                            break;
                        }
                        case 4: {
                            logout();
                            break;
                        }
                    }
                }
            } else {
                System.out.println("Invalid username / pin");
            }

        } while(true);
    }

    public static int doMenu() {
        int menuSelect;
        do {
            System.out.println(" Press number to select your option");
            System.out.println("  1. Display balance");
            System.out.println("  2. Take money");
            System.out.println("  3. Add money");
            System.out.println("  4. Logout");
            menuSelect = scanner.nextInt();
        } while(menuSelect < 1 || menuSelect > 4);
        return menuSelect;
    }

    public static void doBalance() {
        String displayBalance = String.format("%.2f", currentBalance);
        System.out.println(" You have " + displayBalance);
    }

    public static void addMoney() {
        System.out.println(" Please enter amount how much to add");
        int amountToBeAdded = scanner.nextInt();
        currentBalance = currentBalance + amountToBeAdded;
        doBalance();
    }

    public static void removeMoney() {
        System.out.println(" Please enter amount how much to remove");
        int amountToBeRemoved = scanner.nextInt();
        if (amountToBeRemoved > currentBalance) {
            System.out.println(" Your amount is too big to be removed");
            doBalance();
        } else {
            currentBalance -= amountToBeRemoved;
            doBalance();
        }
    }

    public static void logout() {
        // TODO: Incomplete code
    }

}
