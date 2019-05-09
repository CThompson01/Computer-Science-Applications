package Shops;

import java.util.Scanner;

public class GiftShop implements Shopping {
    private static String[] products = {"Coat","Shirt","Pants","Shoes","Socks", "Hats",
            "Keychain", "Boardgame", "Postcard","Coins"};

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
