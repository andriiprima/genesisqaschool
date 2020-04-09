public class Zavd6 {
    public static void main(String[] args) {
        //6.Создать массив случайных чисел (размером 15 элементов).
        //Создайте второй массив в два раза больше, первые 15 элементов должны быть равны элементам первого массива,
        //а остальные элементы заполнить удвоенных значением начальных.
        //Например
        //Было → {1,4,7,2}
        //Стало → {1,4,7,2,2,8,14,4}
        int[] array1 = new int[15];
        int[] array2 = new int[30];
        for (int i = 0; i<15; i++) {
            array1[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i<30; i++) {
            if (i<=14) array2[i] = array1[i];
            else array2[i] = array1[i%15]*2;
        }
        for (int i = 0; i<15; i++) {
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        for (int i = 0; i<30; i++) {
            System.out.print(array2[i]+" ");
        }
    }
}
