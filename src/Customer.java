public class Customer{
    String name;
    SuperMarket superMarket;

    public Customer(String name){
        this.name = name;
    }

    public void goToSuperMarket(SuperMarket superMarket){
        this.superMarket = superMarket;
    }

    public void buyItem(String productName, int amount){
        if(superMarket == null){
            System.out.println("choose a supermarket");
            return;
        }

        for(int i = 0; i < superMarket.products.size(); i++) {
            Product product = superMarket.products.get(i);

            if (product.name.equalsIgnoreCase(productName)) {
                superMarket.buyItem(product, amount);
                return;
            }
        }
        System.out.println(superMarket.name + " does not sell " + productName);
    }
}