import java.util.*;

public class Main {
    public static void main(String[] args){

        List<Product> productsHalbertEijn = new ArrayList<>();
        products1.add(new Product("bread", 3.5, 6));
        products1.add(new Product("fruit", 3.4, 22));
        products1.add(new Product("toiletPaper", 8.89, 10));
        products1.add(new Product("cheese", 1.75, 13));

        List<Product> productsDumbo = new ArrayList<>();
        products2.add(new Product("bread", 3.5, 6));
        products2.add(new Product("fruit", 3.4, 22));
        products2.add(new Product("toiletPaper", 8.89, 10));
        products2.add(new Product("cheese", 1.75, 13));

        List<Product> productsCaldi = new ArrayList<>();
        products3.add(new Product("bread", 3.5, 6));
        products3.add(new Product("fruit", 3.4, 22));
        products3.add(new Product("toiletPaper", 8.89, 10));
        products3.add(new Product("cheese", 1.75, 13));

        Map<String, SuperMarket> SuperMarkets = new HashMap<>();
            new SuperMarket("Halbert Eijn", productsHalbertEijn);
            new SuperMarket("Dumbo", productsDumbo);
            new SuperMarket("Caldi", productsCaldi);

//      ----   Opdracht Supermarket (niet interactief)   ----

//        Product bread = new Product("bread", 3.5, 6);
//        Product fruit = new Product("fruit", 3.4, 22);
//        Product toiletPaper = new Product("toiletPaper", 8.89, 10);
//        Product cheese = new Product("cheese", 1.75, 13);

//        SuperMarket superMarket = new SuperMarket(bread, fruit, toiletPaper, cheese);

//        Customer customer = new Customer("Marina");
//        customer.goToSuperMarket(superMarket);
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Which product do you want to buy?");
//        String productName = scanner.nextLine();
//
//        System.out.println("How many do you want to buy?");
//        int amount = scanner.nextInt();
//
//        customer.buyItem(productName, amount);
    }
}