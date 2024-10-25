package rectangularroomcalculator;

public class RectangularRoomCalculator implements GeometricCalculation{

    @Override
    public void calculateArea(double roomHeight, double roomWidth) {
        double roomArea = roomHeight * roomWidth;
        System.out.printf("""
                ***************************************
                Em uma sala com a largura: %.2f e
                altura: %.2f temos uma área: %.2f
                ***************************************
                """,roomHeight, roomWidth, roomArea );
    }

    @Override
    public void calculatePerimeter(double roomHeight, double roomWidth) {
        double roomPerimeter = (roomHeight * 2) + (roomWidth * 2);
        System.out.printf("""
                ***************************************
                Em uma sala com a largura: %.2f e
                altura: %.2f temos um perímetro: %.2f
                ***************************************
                """,roomHeight, roomWidth, roomPerimeter );
    }
}
