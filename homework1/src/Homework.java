public class Homework {
    public static void main(String[] args) {
        //1. Найти максимум из 3-х чисел (if else)
        int a = 45;
        int b = 100;
        int c = 80;
        if ((a>=b) && (a>=c)) System.out.println("Найбільше з трьох чисел - " +a);
        else if ((b>=a)&&(b>=c)) System.out.println("Найбільше з трьох чисел - " +b);
        else System.out.println("Найбільше з трьох чисел - " +c);
        //2. Дано 2 числа типа String и вернуть их сумму тоже в String
        String firstnum = "5";
        String secondnum = "10";
        String result = Integer.toString(Integer.parseInt(firstnum)+Integer.parseInt(secondnum));
        System.out.println("Сума "+firstnum+" і "+secondnum+" = "+result);
        //3. Определить четное или нечетное число. Если четное вывести true если не четное false
        int num = 10;
        boolean bool = num%2==0;
        System.out.println(bool);
        //4. Есть 2 стороны параллелограмма. Найти площадь параллелограмма
        //Інформації в дано недостатньо, тому нехай кут між ними - прямий.
        double side1 = 5;
        double side2 = 10;
        double anglesin = Math.sin(3.1415/2);
        double res = side1*side2*anglesin;
        System.out.println("Площа паралелограма = "+res);
        //5. Написать программу которая вычислит и выведет на экран площадь треугольника если известны его стороны.
        //Формула Герона S = sqrt(p*(p-a)*(p-b)*(p-c)), де p - півпериметр, a,b,c - сторони
        //Я не умнічаю, це єдина формула площі за 3 сторонами.
        double line1 = 5;
        double line2 = 10;
        double line3 = 7;
        double p = (line1+line2+line3)/2.0;
        double s = Math.sqrt(p*(p-line1)*(p-line2)*(p-line3));
        System.out.println("Площа трикутника = "+s);
    }
}