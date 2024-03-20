import java.util.Random;

public class Task6 {
    public static void main(String[] args) {

        // Составить программу:
        // 1. нахождения минимального значения среди элементов любой строки двумерного массива;
        // 2. нахождения максимального значения среди элементов любого столбца двумерного массива.
        Random r = new Random();
        int[][] ar = new int[r.nextInt(2,10)][r.nextInt(2,10)];
        System.out.println("Задан массив:");
        for (int i = 0;i < ar.length;i++) {
            for (int j = 0;j < ar[i].length;j++) {
                ar[i][j] = r.nextInt(-100,100);
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        int rowIndex = r.nextInt(ar.length-1);
        int minRow = ar[rowIndex][0];
        for (int i : ar[rowIndex]) {
            if (minRow > i) {
                minRow = i;
            }
        }
        System.out.println("Минимум "+(rowIndex+1)+" строки: "+minRow);

        int colIndex = r.nextInt(ar[0].length-1);
        int maxCol = ar[0][colIndex];
        for (int[] i : ar) {
            if (maxCol < i[colIndex]) {
                maxCol = i[colIndex];
            }
        }
        System.out.println("Максимум "+(colIndex+1)+" столбца "+maxCol);
    }
}
