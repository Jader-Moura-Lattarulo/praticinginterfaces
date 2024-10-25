import currencyconverter.CurrencyConverter;
import multiplicationtable.MultiplicationTable;
import multiplicationtable.MultiplicativeOperations;
import rectangularroomcalculator.RectangularRoomCalculator;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        currencyConverter.convertDollarToReal(5.5);

        RectangularRoomCalculator rectangularRoomCalculator = new RectangularRoomCalculator();
        rectangularRoomCalculator.calculateArea(15, 18.5);
        rectangularRoomCalculator.calculatePerimeter(15, 18.5);

        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.showMultiplicationTable(5);
    }
}