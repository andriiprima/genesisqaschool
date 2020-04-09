public class Zavd4 {
    public static void main(String[] args) {
        //4.Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета нечетных цифр в нем.
        int[] array = {0,5,2,4,7,1,3,19};
        //В умові сказано рахувати цифри, тому я рахую тільки числа від 0 до 9
        int countdigits = 0;
        for (int i = 0; i<array.length; i++) {
                if (array[i]>=0&&array[i]<10&&array[i]%2==1) {
                    countdigits++;
                }
            }
        System.out.println("Кількість непарних цифр в масиві дорівнює "+countdigits);
        }
    }
