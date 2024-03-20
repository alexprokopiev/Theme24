public class Task3 {
    public static void main(String[] args) {

        // Определить:
        // 1. сумму всех элементов массива;
        // 2. произведение всех элементов массива;
        // 3. сумму квадратов всех элементов массива;
        // 4. сумму шести первых элементов массива.
        int[] ar = new int[12];
        System.out.print("Массив: ");
        for (int i = 0;i < ar.length;i++) {
            ar[i] = i+1;
            System.out.print(ar[i]+" ");
        }
        System.out.println();

        int sum = 0;
        for (int i : ar) {
            sum += i;
        }
        System.out.println("Сумма элементов массива: "+sum);

        int mult = 1;
        for (int i : ar) {
            mult *= i;
        }
        System.out.println("Произведение всех элементов массива: "+mult);

        int sumPow = 0;
        for (int i : ar) {
            sumPow += (int) Math.pow(i, 2);
        }
        System.out.println("Сумма квадратов всех элементов массива: "+sumPow);

        int sumFirstToSix = 0;
        for (int i = 0;i < 6;i++) {
            sumFirstToSix += ar[i];
        }
        System.out.println("Сумма шести первых элементов массива: "+sumFirstToSix);
    }
}
