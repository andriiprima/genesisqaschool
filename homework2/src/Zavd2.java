import java.util.Scanner;

public class Zavd2 {
    public static void main(String[] args) {
//      2. С помощью циклов нарисовать «обои». Причем количество полос должно вводиться с клавиатуры. В примере 7 полос.
//            ***+++***+++***+++***
//            ***+++***+++***+++***
//            ***+++***+++***+++***
//            ***+++***+++***+++***
//            ***+++***+++***+++***
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість смуг ");
        int quantity = scanner.nextInt();
        for (int i = 0; i<5; i++) {
            for (int j=0; j<quantity; j++) {
                if (j%2==0) {
                    System.out.print("***");
                }
                else System.out.print("+++");
            }
            System.out.println();
        }
    }
}
