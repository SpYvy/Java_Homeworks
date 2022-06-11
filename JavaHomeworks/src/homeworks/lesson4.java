package homeworks;

import java.util.Random;
import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        initGameField();
        printGameField();

        while (true) {
            humanTurn();
            if (checkWin(X)) {
                System.out.println("Вы победили!");
                printGameField();
                break;
            }
            printGameField();
            aiTurn();
            if (checkWin(O)) {
                System.out.println("ИИ победил!");
                printGameField();
                break;
            }
            printGameField();
        }
    }

    public static int size = 5; // Работает для любого размера поля
    public static int charsToWin = 3; // Можно выбрать любое значение, желательно меньше ширины поля
    public static char empty = '•';
    public static char X = 'X';
    public static char O = 'O';
    public static char[][] gameField = new char[size][size];
    public static void initGameField(){
        for(int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                gameField[i][j] = empty;
            }
        }
    }
    public static void printGameField(){
        System.out.print("   ");
        for(int i = 0; i < size; i++){
            System.out.print((i + 1) + "  "); // Координаты X
        }
        System.out.println();
        for(int i = 0; i < size; i++){
            System.out.print((i + 1) + "  "); // Координаты Y
            for (int j = 0; j < size; j++) {
                System.out.print(gameField[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

private static boolean checkWin(char checkChar) {
    for (int i = 0; i < size; i++) {
        int horizontalCounter = 0; // Обнуляю счетчик перед каждой новой строкой/столбцом
        int verticalCounter = 0;
        for (int j = 0; j < size; j++) {

            if (gameField[i][j] == checkChar) { // Считаю совпадения по горизонтали
                horizontalCounter++;
                if (horizontalCounter == charsToWin) return true;

            }
            if (gameField[j][i] == checkChar) { // Переворачиваю поле так, что проверка идентична горизонтальной.
                verticalCounter++;
                if (verticalCounter == charsToWin) return true;
            }
        }
    }
    int diagonalCounter1 = 0;
    int diagonalCounter2 = 0;

    for (int i = 0, j = size - 1; i < size; i++, j--) {
        if (gameField[i][i] == checkChar) { // Проверка первой диагонали
            diagonalCounter1++;
            if (diagonalCounter1 == charsToWin) return true;
        }
        if (gameField[i][j] == checkChar) { // Проверка второй диагонали
            diagonalCounter2++;
            if (diagonalCounter2 == charsToWin) return true;
        }
    }
    return false;
}
    public static void humanTurn(){
        int x, y;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (cellIsInvalid(x, y));
        gameField[x][y] = X;
    }

    public static void aiTurn(){
        Random random = new Random();
        int x, y;
        do{
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (cellIsInvalid(x, y));
        gameField[x][y] = O;
        System.out.println("Компьютер выбрал " + (x + 1) + " " + (y + 1));
    }

    private static boolean cellIsInvalid(int x, int y) {
        if (x >= size || y >= size || x < 0 || y < 0) return true;
        if (gameField[x][y] != empty) return true;
        return false;
    }
}