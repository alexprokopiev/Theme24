import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        // Дан массив. Вывести на экран сначала его неотрицательные элементы, затем отрицательные.
        Random r = new Random();
        int[] ar = new int[r.nextInt(50)];
        for (int i = 0;i < ar.length;i++) {
            ar[i] = r.nextInt(-500,500);
        }
        System.out.println("Неотрицательные элементы массива: ");
        for (int i:ar) {
            if (i >= 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Отрицательные элементы массива: ");
        for (int i:ar) {
            if (i < 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
