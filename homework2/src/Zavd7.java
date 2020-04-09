import java.util.Scanner;

public class Zavd7 {
    //7.Введите строку текста с клавиатуры — реализуйте программу для
    //возможности подсчета количества символа — 'b' в этой строке, с выводом результат на экран.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть рядок тексту: ");
        String s = scanner.nextLine();
        String[] s2 = new String[s.length()];
        s2 = s.split("");
        int count=0;
        for (int i = 0; i<s.length(); i++) {
            if (s2[i].equals("b")) {
                count++;
            }
        }
        System.out.println("Кількість символів 'b' в рядку = "+count);
    }
}
