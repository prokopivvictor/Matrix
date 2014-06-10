import java.util.Random;

public class Matrix {
    public static Random rand = new Random();
    private int rows;
    private int cols;
    private int[][] value = new int[3][3];

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public int[][] getValue() {
        return value;
    }

    public void setValue(int[][] value) {
        this.value = value;
    }

    public void setElementOfValue(int a, int b, int c) {
        value[a][b] = c;
    }

    public int getElementOfValue(int a, int b) {
        return value[a][b];
    }

    public void fillRandomValues() {
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[i].length; j++) {
                setElementOfValue(i, j, rand.nextInt(20));

            }

        }
    }
}
