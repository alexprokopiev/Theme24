public class Task1 {
    public static void main(String[] args) {

        // Заполнить массив из двенадцати элементов 1, 2, ... 12.

        int[] ar = new int[12];
        System.out.print("Массив: ");
        for (int i = 0;i < ar.length;i++) {
            ar[i] = i+1;
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
}
