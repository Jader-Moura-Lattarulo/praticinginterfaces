package bookprice;

public class Book implements Calculable{
    private double price;
    private double discounts;

    public Book(double price, double discounts) {
        this.price = price;
        this.discounts = discounts;
    }

    @Override
    public double calculateFinalPrice(){
        return price - discounts;
    }
}
