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

        Map<String, SuperMarket> superMarkets = new HashMap<>();
            superMarkets.put("halbert eijn", new SuperMarket("Halbert Eijn", productsHalbertEijn));
            superMarkets.put("dumbo", new SuperMarket("Dumbo", productsDumbo));
            superMarkets.put("caldi", new SuperMarket("Caldi", productsCaldi));

        Customer customer = new Customer("Marina");
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 - Pick a supermarket");
            System.out.println("2 - buy a product");
            System.out.println("3 - restock a product");
            System.out.println("4 - exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Which supermarket do you want to go to?");
                    System.out.println("Pick one of the following:");
                    System.out.println("- Halbert Eijn");
                    System.out.println("- Dumbo");
                    System.out.println("- Caldi");
                    String superMarketChoice = scanner.nextLine().toLowerCase();
                    SuperMarket chosenSuperMarket = superMarkets.get(superMarketChoice);

                    if (chosenSuperMarket == null) {
                        System.out.println("That supermarket does not exist.");
                        break;
                    }

                    customer.goToSuperMarket(chosenSuperMarket);
                    System.out.println("You are now shopping at " + chosenSuperMarket.name);
                    break;
                case 2:
                    if(customer.superMarket == null) {
                        System.out.println("Pick a supermarket first.");
                        break;
                    }
                    System.out.println("Which product do you want to buy?");
                    String productName = scanner.nextLine();

                    System.out.println("How many do you want to buy?");
                    int amount = scanner.nextInt();
                    scanner.nextLine();

                    customer.buyItem(productName, amount);
                    break;

                case 3:
                    System.out.println("Which supermarket do you want to restock?");
                    System.out.println("Pick one of the following:");
                    System.out.println("- Halbert Eijn");
                    System.out.println("- Dumbo");
                    System.out.println("- Caldi");
                    superMarketChoice = scanner.nextLine().toLowerCase();

                    SuperMarket restockSuperMarket = superMarkets.get(superMarketChoice);
                    if (restockSuperMarket == null) {
                        System.out.println("That supermarket does not exist.");
                        break;
                    }

                    System.out.println("Which product do you want to restock in " + restockSuperMarket.name + "?");
                    String restockProduct = scanner.nextLine();
                    System.out.println("How many do you want to add?");
                    int restockAmount = scanner.nextInt();
                    scanner.nextLine();

                    restockSuperMarket.restockItem(restockProduct, restockAmount);
                    break;
                case 4:
                    System.out.println("Thanks for shopping - until next time!");
                    return;
                default:
                    System.out.println("Oops, I can't use this input. Let’s try that again!");
                    break;
            }
        }
    }
}