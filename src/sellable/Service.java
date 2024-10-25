package sellable;

public class Service implements Sellable{
    int quantityPurchased;
    double price;

    public Service(int quantityPurchased, double price) {
        this.quantityPurchased = quantityPurchased;
        this.price = price;
    }

    public double calculateTotalPrice(){

        if(quantityPurchased <= 0) throw new IllegalArgumentException("É necessário compar pelo menos um serviço para o calculo");

        if(quantityPurchased < 3) {
            return price;
        } else if (quantityPurchased < 10) {
            return price - ((price/100) * 5);
        } else if (quantityPurchased < 15) {
            return price - ((price / 100) * 10);
        } else {
            return price - ((price / 100) * 15);
        }
    }
}
