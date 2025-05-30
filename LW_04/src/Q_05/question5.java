package Q_05;

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        displayMenu();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the category (1-Entree, 2-Side Dish, 3-Drink): ");
        int category = scanner.nextInt();

        switch (category) {
            case 1:
                displayEntreeMenu();
                break;
            case 2:
                displaySideDishMenu();
                break;
            case 3:
                displayDrinkMenu();
                break;
            default:
                System.out.println("Invalid category selection.");
                scanner.close();
                return;
        }

        System.out.print("Enter the item number: ");
        int item = scanner.nextInt();
        scanner.close();

        double price = 0.0;
        switch (category) {
            case 1:
                price = getEntreePrice(item);
                break;
            case 2:
                price = getSideDishPrice(item);
                break;
            case 3:
                price = getDrinkPrice(item);
                break;
        }

        if (price == 0.0) {
            System.out.println("Invalid item selection.");
        } else {
            System.out.printf("The price is: $%.2f%n", price);
        }
    }

    public static void displayMenu() {
        System.out.println("Menu Categories:");
        System.out.println("1. Entree");
        System.out.println("2. Side Dish");
        System.out.println("3. Drink");
    }

    public static void displayEntreeMenu() {
        System.out.println("Entree Menu:");
        System.out.println("1. Tofu Burger - $3.49");
        System.out.println("2. Cajun Chicken - $4.59");
        System.out.println("3. Buffalo Wings - $3.99");
        System.out.println("4. Rainbow Fillet - $2.99");
    }

    public static void displaySideDishMenu() {
        System.out.println("Side Dish Menu:");
        System.out.println("1. Rice Cracker - $0.79");
        System.out.println("2. No-Salt Fries - $0.69");
        System.out.println("3. Zucchini - $1.09");
        System.out.println("4. Brown Rice - $0.59");
    }

    public static void displayDrinkMenu() {
        System.out.println("Drink Menu:");
        System.out.println("1. Cafe Mocha - $1.99");
        System.out.println("2. Cafe Latte - $1.98"); // Fixed to match getDrinkPrice
        System.out.println("3. Espresso - $2.49");
        System.out.println("4. Oolong Tea - $0.99");
    }

    public static double getEntreePrice(int item) {
        switch (item) {
            case 1: return 3.49;
            case 2: return 4.59;
            case 3: return 3.99;
            case 4: return 2.99;
            default: return 0.0;
        }
    }

    public static double getSideDishPrice(int item) {
        switch (item) {
            case 1: return 0.79;
            case 2: return 0.69;
            case 3: return 1.09;
            case 4: return 0.59;
            default: return 0.0;
        }
    }

    public static double getDrinkPrice(int item) {
        switch (item) {
            case 1: return 1.99;
            case 2: return 1.98; // Matches displayDrinkMenu now
            case 3: return 2.49;
            case 4: return 0.99;
            default: return 0.0;
        }
    }
}
