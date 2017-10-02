package lt.vcs;

import java.util.Scanner;

/**
 * Program emulates how ATM machine works.
 * <p>
 * ATM machine has two states, logged in and not logged in.
 * <p>
 * Not logged in
 * Will as user to "authenticate itself" (for now leave only one username/password)
 * If authentication fails, ask user to try again.
 * If authentication succeeds, change app state to "Logged in"
 * <p>
 * Logged in
 * User can see the current ballance of his card (eg.: 200$)
 * User can withdraw money (cannot withdraw more than there is on his current ballance)
 * User can bring in money.
 * User can log out of the account (change app state to "Not logged in")
 */
public class AppATM {

    public static Scanner scanner = new Scanner(System.in);

    public static String validUsername = "Jonas";
    public static String validPin = "1234";
    public static double currentBalance = 1000.333333;

    public static int STATE_LOGGED_IN = 1;
    public static int STATE_NOT_LOGGED_IN = 0;
    public static int currentState = STATE_NOT_LOGGED_IN;

    public static void main(String[] args) {
        do {
            if (currentState == STATE_LOGGED_IN) {
                doMenu();
            } else if (currentState == STATE_NOT_LOGGED_IN) {
                doLogin();
            }
        } while (true);
    }

    public static void doLogin() {
        System.out.println(" Please enter username");
        String username = scanner.nextLine();
        System.out.println(" Please enter pin number");
        String enteredPin = scanner.nextLine();
        if (username.equals(validUsername) && enteredPin.equals(validPin)) {
            currentState = STATE_LOGGED_IN;
        } else {
            currentState = STATE_NOT_LOGGED_IN;
        }
    }

    public static void doMenu() {
        int menuSelection;
        System.out.println(" Press number to select your option");
        System.out.println("  1. Display balance");
        System.out.println("  2. Take money");
        System.out.println("  3. Add money");
        System.out.println("  4. Logout");
        menuSelection = scanner.nextInt();
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

    public static void logout() {
        currentState = STATE_NOT_LOGGED_IN;
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

}
