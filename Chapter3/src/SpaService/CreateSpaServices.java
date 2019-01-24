package SpaService;

import java.util.Scanner;

public class CreateSpaServices {
    public static void main(String[] args) {
//        String service;
//        double price;
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
//        Scanner input = new Scanner(System.in);

        firstService = getData(firstService);
        secondService = getData(secondService);

        // Fills out the info for the first service
//        System.out.print("Enter service >> ");
//        service = input.nextLine();
//        System.out.print("Enter price >> ");
//        price = input.nextDouble();
//        firstService.setServiceDescription(service);
//        firstService.setPrice(price);
//        input.nextLine();

        // Fills out the info for the second service
//        System.out.print("Enter service >> ");
//        service = input.nextLine();
//        System.out.print("Enter price >> ");
//        price = input.nextDouble();
//        secondService.setServiceDescription(service);
//        secondService.setPrice(price);

        // Prints Services
        System.out.println("First Service Details: " + firstService.getServiceDescription() +
                " $" + firstService.getPrice());
        System.out.println("Second Service Details: " + secondService.getServiceDescription() +
                " $" + secondService.getPrice());
    }

    public static SpaService getData(SpaService s) {
        String service;
        double price;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter service >> ");
        service = input.nextLine();
        System.out.print("Enter price >> ");
        price = input.nextDouble();
        input.nextLine();

        s.setServiceDescription(service);
        s.setPrice(price);
        return s;
    }
}
