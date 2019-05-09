package Shops;

public class Wallet {
    private static double money = 100;

    public static  double getMoney() {
        return money;
    }

    public static void subtractMoney(double amount) {
        money -= amount;
    }

    public static void setMoney(double amount) {
        money = amount;
    }
}
