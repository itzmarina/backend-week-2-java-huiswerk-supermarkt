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
        if(productName.equals("bread")) {
            superMarket.buyBread(amount);
        } else if (productName.equals("fruit")) {
            superMarket.buyFruit(amount);
        } else if (productName.equals("toiletPaper")) {
            superMarket.buyToiletPaper(amount);
        } else if (productName.equals("cheese")) {
            superMarket.buyCheese(amount);
        } else {
            System.out.println("Enter a valid product name");
        }
    }
}