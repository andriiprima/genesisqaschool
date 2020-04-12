import java.io.*;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner (System.in);
        String s;
        System.out.println("Додати студента в список?(Y/N)");
        s = scanner.nextLine();
        if (!s.equalsIgnoreCase("Y")) return;
        File file = new File ("Students.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        boolean isInFile; //Змінна для перевірки чи вже є такий студент у файлі
        String line;
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        do {
            System.out.println("Ім'я студента, якого треба додати в список:");
            String name = scanner.nextLine();
            isInFile = false;
            //Об'являю FileWriter кожен раз у циклі заново для того, щоб з кожною новою ітерацією
            //файл читався заново і не можна було додати 2 однакових імені в одному запуску програми
            FileWriter writer = new FileWriter("Students.txt", true);
            BufferedWriter bw = new BufferedWriter(writer);
            while ((line=br.readLine())!=null) {
                if (name.equalsIgnoreCase(line)) {
                    isInFile = true;
                }
            }
            if (!isInFile) {
                bw.write(name + "\n");
            }
            else System.out.println("Такий студент уже є в списку, список не був обновлений");
            System.out.println("Продовжити?(Y/N)");
            s = scanner.nextLine();
            bw.close();
        } while (s.equalsIgnoreCase("Y"));
        br.close();
        scanner.close();
    }
}
