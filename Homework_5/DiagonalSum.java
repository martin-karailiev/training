package Homework_5;

public class DiagonalSum {
    public static void main(String[] args) {


    int[][] array = { { 1, 2, 8, 9 }, { 4, 5, 1, 7 }, { 6, 8, 2, 9 }, {5, 6, 8, 7} };

		System.out.println("Diagonal sum is " + sumOfDiagonal(array));
}

    private static int sumOfDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++) {
                if (i == j) {
                    sum += a[i][j];
                }
                if (i + j == a.length - 1) {
                    sum += a[i][j];
                }
            }
        return sum;
    }
}

