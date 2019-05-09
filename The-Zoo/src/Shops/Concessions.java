package Shops;

import java.util.Scanner;

public class Concessions implements Shopping {
    private static String[] products = {"Corndog","Popcorn","Pie","Corn","Burger"};

    public static String checkout(Scanner input) {
        System.out.println("Products for Sale:");
        for (String product : products) {
            System.out.print(product + ",");
        }
        System.out.println(">");
        return sellProduct(input.nextLine());
    }

    public static String sellProduct(String product) {
        Wallet.subtractMoney(5);
        return "You bought the " + product + ". You have $" + Wallet.getMoney();
    }
}
