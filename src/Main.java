import currencyconverter.CurrencyConverter;
import rectangularroomcalculator.RectangularRoomCalculator;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        currencyConverter.convertDollarToReal(5.5);

        RectangularRoomCalculator rectangularRoomCalculator = new RectangularRoomCalculator();
        rectangularRoomCalculator.calculateArea(15, 18.5);
        rectangularRoomCalculator.calculatePerimeter(15, 18.5);
    }
}