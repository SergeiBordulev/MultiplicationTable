public class MultiplicationTable {
    private static int[][] getMultiplicationTable(int rowsAmount, int columnsAmount) {
        int[][] table = new int[rowsAmount][columnsAmount];

        for (int i = 0; i < rowsAmount; i++) {
            for (int j = 0; j < columnsAmount; j++) {
                table[i][j] = (j + 1) * (i + 1);
            }
        }

        return table;
    }

    public static void main(String[] args) {
        int rowsAmount = 9;
        int columnsAmount = 19;

        int[][] table = getMultiplicationTable(rowsAmount, columnsAmount);

        for (int[] row : table) {
            System.out.print("|\t");

            for (int column : row) {
                System.out.print(column + "\t|\t");
            }

            System.out.println();
        }
    }
}
