package sellable;

public class Product implements Sellable{
    int quantityPurchased;
    double price;

    public Product(int quantityPurchased, double price) {
        this.quantityPurchased = quantityPurchased;
        this.price = price;
    }

    public double calculateTotalPrice(){
        if(quantityPurchased <= 0) throw new IllegalArgumentException("É necessário compar pelo menos um Produto para o calculo");

        if(quantityPurchased < 10) {
            return price;
        } else if (quantityPurchased < 50) {
            return price - ((price/100) * 5);
        } else if (quantityPurchased < 100) {
            return price - ((price / 100) * 10);
        } else {
            return price - ((price / 100) * 15);
        }
    }
}
