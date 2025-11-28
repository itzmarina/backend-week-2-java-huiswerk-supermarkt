import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        SuperMarket supermarket;
        Customer customer = null;
        Scanner scanner = null;

        Product bread = new Product("bread", 3.5, 6);
        Product fruit = new Product("fruit", 3.4, 22);
        Product toiletPaper = new Product("toiletPaper", 8.89, 10);
        Product cheese = new Product("cheese", 1.75, 13);

        SuperMarket superMarket = new SuperMarket(bread, fruit, toiletPaper, cheese);

        System.out.println("Which product do you want to buy?");
        String productName = scanner.nextLine();

        System.out.println("How many do you want to buy?");
        int amount = scanner.nextInt();

        customer.buyItem(productName, amount);

        scanner.close();

    }
}