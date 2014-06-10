public class Multiplication {
    public static void defoultMulti(Matrix matrixA, Matrix matrixB, Matrix matrixC){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int cell = matrixA.getElementOfValue(i,j)*matrixB.getElementOfValue(i,j);
                matrixC.setElementOfValue(i,j,cell);
            }
        }
    }
}
