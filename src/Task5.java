import java.util.Random;

public class Task5 {
    public static void main(String[] args) {

        // Дан массив. Определить:
        // 1. количество максимальных элементов в массиве;
        // 2. количество минимальных элементов в массиве.
        Random r = new Random();
        int[] ar = new int[r.nextInt(1,50)];
        System.out.println("Задан массив: ");
        for (int i = 0;i < ar.length;i++) {
            ar[i] = r.nextInt(-10,10);
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        int min = ar[0];
        int countMin = 0;
        int max = ar[0];
        int countMax = 0;
        for (int i : ar) {
            if (min > i) {
                min = i;
                countMin = 1;
            } else if (min == i) {
                countMin++;
            }
            if (max < i) {
                max = i;
                countMax = 1;
            } else if (max == i) {
                countMax++;
            }
        }
        System.out.println("Минимум: "+min);
        System.out.println("Количество минимальных элементов: "+countMin);
        System.out.println("Максимум: "+max);
        System.out.println("Количество максимальных элементов: "+countMax);
    }
}
