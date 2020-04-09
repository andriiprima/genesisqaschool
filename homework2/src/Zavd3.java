import java.util.Scanner;

public class Zavd3 {
    public static void main(String[] args) {
//      3.Вычислить с помощью цикла факториал числа - n введенного с клавиатуры (4<n<16).
//      Факториал числа это произведение всех чисел от этого числа до 1.
//      Например 5!=5*4*3*2*1=120
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число n: ");
        int n = scanner.nextInt();
        int result = 1;
        for (int i = 1; i<=n; i++) {
            result *= i;
        }
        System.out.println("n! = "+result);
    }
}
