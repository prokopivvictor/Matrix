import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Matrix matrixA = new Matrix();
        Matrix matrixB = new Matrix();
        Matrix matrixC = new Matrix();

        matrixA.fillRandomValues();
        matrixB.fillRandomValues();

        Multiplication.defoultMulti(matrixA, matrixB, matrixC);

        System.out.println(Arrays.deepToString(matrixA.getValue()));
        System.out.println(Arrays.deepToString(matrixB.getValue()));
        System.out.println(Arrays.deepToString(matrixC.getValue()));
    }
}
