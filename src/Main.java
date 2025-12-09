import java.util.*;

public class Main {
    public static void main(String[] args){

        List<Product> productsHalbertEijn = new ArrayList<>();
        productsHalbertEijn.add(new Product("bread", 3.5, 6));
        productsHalbertEijn.add(new Product("fruit", 3.4, 22));
        productsHalbertEijn.add(new Product("toiletPaper", 8.89, 10));
        productsHalbertEijn.add(new Product("cheese", 1.75, 13));

        List<Product> productsDumbo = new ArrayList<>();
        productsDumbo.add(new Product("bread", 3.5, 6));
        productsDumbo.add(new Product("fruit", 3.4, 22));
        productsDumbo.add(new Product("toiletPaper", 8.89, 10));
        productsDumbo.add(new Product("cheese", 1.75, 13));

        List<Product> productsCaldi = new ArrayList<>();
        productsCaldi.add(new Product("bread", 3.5, 6));
        productsCaldi.add(new Product("fruit", 3.4, 22));
        productsCaldi.add(new Product("toiletPaper", 8.89, 10));
        productsCaldi.add(new Product("cheese", 1.75, 13));

        Map<String, SuperMarket> SuperMarkets = new HashMap<>();
            new SuperMarket("Halbert Eijn", productsHalbertEijn);
            new SuperMarket("Dumbo", productsDumbo);
            new SuperMarket("Caldi", productsCaldi);

        Customer customer = new Customer("Marina");
        customer.goToSuperMarket(superMarket);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which product do you want to buy?");
        String productName = scanner.nextLine();

        System.out.println("How many do you want to buy?");
        int amount = scanner.nextInt();

        customer.buyItem(productName, amount);
    }
}