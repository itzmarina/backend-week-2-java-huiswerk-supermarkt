import java.util.ArrayList;
import java.util.List;

public class SuperMarket{
//    Product bread;
//    Product fruit;
//    Product toiletPaper;
//    Product cheese;

    List<Product> products;
    String name;


    public SuperMarket(String name, List<Product> products){
        if (products == null) {
            products = new ArrayList<>(); // maak een lege lijst
        }

        this.name = name;
        this.products = products;


//        this.bread = bread;
//        this.fruit = fruit;
//        this.toiletPaper = toiletPaper;
//        this.cheese = cheese;
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

    public void buyBread(int amount){
        buyItem(this.bread, amount);
    }

    public void buyFruit(int amount){
        buyItem(this.fruit, amount);
    }

    public void buyCheese(int amount){
        buyItem(this.cheese, amount);
    }

    public void buyToiletPaper(int amount){
        buyItem(this.toiletPaper, amount);
    }
}