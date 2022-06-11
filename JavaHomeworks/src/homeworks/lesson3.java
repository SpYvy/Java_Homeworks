package homeworks;

import java.util.Arrays;

public class lesson3 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(zeroOneInverter(new int[]{0, 1, 0, 0, 1, 1, 0})));
//        System.out.println(Arrays.toString(arrayUpTo100()));
//        System.out.println(Arrays.toString(multiplyIfLessThan6(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));
//        System.out.println(Arrays.deepToString(diagonalArray()));
//        System.out.println(Arrays.toString(arrayOfInitialValue(10, 101)));
//        System.out.println(minAndMax(new int[]{15, 16}));
//        System.out.println(isLeftAndRightEqual(new int[]{5, 6, 4, 15}));
//        System.out.println(Arrays.toString(arrayShift(new int[]{1, 2, 3, 4, 5, 6}, -3)));
    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static int[] zeroOneInverter(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static int[] arrayUpTo100() {
        int[] array100 = new int[100];
        for (int i = 0; i < 100; i++) {
            array100[i] = i + 1;
        }
        return array100;
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static int[] multiplyIfLessThan6(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
// заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
// то есть [0][0], [1][1], [2][2], …, [n][n];
    public static int[][] diagonalArray() {
        int[][] diagonal = new int[10][10];
        for (int i = 0; i < diagonal.length; i++) {
            diagonal[i][i] = 1;
            diagonal[i][diagonal.length - 1 - i] = 1;
        }
        return diagonal;
    }

    //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
// одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] arrayOfInitialValue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
    public static String minAndMax(int[] arr) {
        int max = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        return "Минимальный элемент = " + min + ", максимальный элемент = " + max;
    }

    //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
// если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры:
// checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
// checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
// граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
    public static boolean isLeftAndRightEqual(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int leftSide = 0;
            int rightSide = 0;
            for (int j = 0; j < i; j++) { // сумма левой стороны
                leftSide += arr[j];
            }
            for (int k = i; k < arr.length; k++) { // сумма правой стороны
                rightSide += arr[k];
            }
            System.out.printf("%d %d %d%n", i, leftSide, rightSide);

            if (leftSide == rightSide) { // сравнение после одной итерации
                return true;
            }
        }
        return false;
    }

    //8. Написать метод, которому на вход подается одномерный массив и число n (может быть  положительным, или отрицательным),
// при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи
// нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
// [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
    public static int[] arrayShift(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
        for (int i = 0; i > n; i--) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
        return arr;
    }
}