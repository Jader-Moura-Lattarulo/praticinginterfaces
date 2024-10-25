import bookprice.Book;
import bookprice.PhysicalProduct;
import currencyconverter.CurrencyConverter;
import multiplicationtable.MultiplicationTable;
import rectangularroomcalculator.RectangularRoomCalculator;
import temperatureconverter.StandardTemperatureConverter;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        currencyConverter.convertDollarToReal(5.5);

        RectangularRoomCalculator rectangularRoomCalculator = new RectangularRoomCalculator();
        rectangularRoomCalculator.calculateArea(15, 18.5);
        rectangularRoomCalculator.calculatePerimeter(15, 18.5);

        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.showMultiplicationTable(5);

        StandardTemperatureConverter temperatureConverter = new StandardTemperatureConverter();
        temperatureConverter.celsiusToFahrenheit(15);
        temperatureConverter.fahrenheitToCelsius(15);

        Book book = new Book(50, 5);
        PhysicalProduct physicalProduct = new PhysicalProduct(50, 5);

        System.out.println(book.calculateFinalPrice());
        System.out.println(physicalProduct.calculateFinalPrice());

    }
}