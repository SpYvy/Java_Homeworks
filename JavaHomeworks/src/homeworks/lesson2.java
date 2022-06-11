package homeworks;

public class lesson2 {
    public static void main(String[] args) {
//        System.out.println(betweenTenAndTwenty(10, 10));
//        System.out.println(positiveOrNegative(1));
//        System.out.println(positiveOrNegativeBoolean(1));
//        System.out.println(printStrings("Повтори5раз ", 5));
//        System.out.println(isYearLeap(1000));
    }

    //1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.
    public static boolean betweenTenAndTwenty(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
// положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static String positiveOrNegative(int a) {
        if (a >= 0) {
            return "Число положительное";
        } else {
            return "Число отрицательное";
        }
    }

    //3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное,
// и вернуть false если положительное.
    public static boolean positiveOrNegativeBoolean(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    //4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку,
// указанное количество раз;
    public static String printStrings(String text, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += text;
        }
        return result;
    }

    //5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean isYearLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
