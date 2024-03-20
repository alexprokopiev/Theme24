public class Task2 {
    public static void main(String[] args) {

        // Вывести элементы массива на экран в обратном порядке.
        int[] ar = new int[12];
        System.out.print("Массив: ");
        for (int i = 0;i < ar.length;i++) {
            ar[i] = i+1;
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        System.out.print("Массив в обратном порядке: ");
        for (int i = ar.length-1;i >= 0;i--) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
}
