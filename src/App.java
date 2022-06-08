/*
    Przygotuj przykładową tablicę dwuwymiarową elementów typu int.
    Zlicz, ile wierszy w tej tablicy posiada średnią arytmetyczną elementów, której
    wartość jest większa od ustalonej przez Ciebie wartości.
*/

public class App {

    static double calculateAverage(int[] row) {
        var s = 0.0;
        for (var r : row) {
            s += r;
        }
        return s / row.length;
    }

    static void validateArray(int[][] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        for (var row : arr) {
            if (row == null || row.length == 0) {
                throw new IllegalArgumentException("Row is null or empty");
            }
        }
    }

    static int countRowsWithAverageGreaterThan(double limit, int[][] arr) {
        validateArray(arr);

        var counter = 0;
        for (var row : arr) {
            if (calculateAverage(row) > limit) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        var numbers = new int[][] {
                {10, 10, 10},
                {20, 20, 20},
                {30, 30, 30}
        };

        System.out.println(countRowsWithAverageGreaterThan(10, numbers));
        System.out.println(countRowsWithAverageGreaterThan(20, numbers));
        System.out.println(countRowsWithAverageGreaterThan(30, numbers));
    }
}
