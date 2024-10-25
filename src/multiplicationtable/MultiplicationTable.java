package multiplicationtable;

public class MultiplicationTable implements MultiplicativeOperations{

    @Override
    public void showMultiplicationTable(double factor){
        double product;

        System.out.println("**********************************");

        for (int i = 0; i <= 10; i++) {
            product = factor * i;

            System.out.printf("%.2f X %d = %.2f",factor, i, product);
            System.out.println();
        }
        System.out.println("**********************************");
    }
}
