import java.util.Scanner;

public class Zavd1 {
    public static void main(String[] args) {
//      1. Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда начинается с единицы. На одном этаже 4 квартиры.
//      Напишите программу которая получит номер квартиры с клавиатуры,
//      и выведет на экран на каком этаже, какого подъезда расположенна эта квартира.
//      Если такой квартиры нет в этом доме то нужно сообщить об этом пользователю.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер квартири ");
        int number = scanner.nextInt();
        if ((number>4*9*4)||(number<1)) {
            System.out.println("Такої квартири в домі немає");
            return;
        }
        int pidyizd = 0;
        int poverh = 0;
        if (number%36==0) {
            poverh = 9;
            pidyizd = number/36;
        }
        else {
            pidyizd = number /36+1;
            poverh = (int)(Math.ceil((number%36)/4.0));
        }
        System.out.println("Під'їзд номер "+pidyizd+", поверх номер "+poverh+"\n");
    }
}
