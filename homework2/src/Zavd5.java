import java.util.Scanner;

public class Zavd5 {
    public static void main(String[] args) {
        //5.Написать код для возможности создания массива целых чисел
        // (размер вводиться с клавиатуры) заполнените элементы произвольными числами.
        // Выведите этот массив на экран.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i<n; i++) {
            array[i] = (int)(Math.random()*1000);
        }
        for (int i = 0; i<n; i++) {
            System.out.println(array[i]);
        }
    }
}
