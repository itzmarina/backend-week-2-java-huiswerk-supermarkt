import java.util.ArrayList;
import java.util.List;

public class SuperMarket{
    List<Product> products;
    String name;


    public SuperMarket(String name, List<Product> products){
        if (products == null) {
            products = new ArrayList<>();
        }

        this.name = name;
        this.products = products;
    }

    public void buyItem(Product product, int amount) {
        if (amount <= product.amount) {
            product.amount -= amount;
            double totalPrice = amount * product.price;
            System.out.println("You bought " + amount + " " + product.name  + " for " + totalPrice + " euro.");
        }
        else{
            System.out.println("You cannot buy " + amount + " " + product.name + ", we only have " + product.amount + " in stock.");
        }
    }

    public void restockItem(String productName, int amount){
        for(int i = 0; i < products.size(); i++){
            Product product = products.get(i);

            if(product.name.equalsIgnoreCase(productName)){
                product.amount += amount;
                return;
            }
        }
        System.out.println(productName + " cannot restock or does not exist");
    }
}