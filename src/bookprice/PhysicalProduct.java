package bookprice;

public class PhysicalProduct implements Calculable{
    private double price;
    private double additionalFees;

    public PhysicalProduct(double price, double additionalFees) {
        this.price = price;
        this.additionalFees = additionalFees;
    }

    @Override
    public double calculateFinalPrice() {
        return price + additionalFees;
    }
}
