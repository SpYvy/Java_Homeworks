package homeworks.homework5;

public class MainApp {
    // 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон,
    // зарплата, возраст.
    // 2. Конструктор класса должен заполнять эти поля при создании объекта.
    // 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об
    // объекте в консоль.
    // 4. Создать массив из 5 сотрудников.
    // Пример:
    // Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    // persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
    // "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
    // persArray[1] = new Person(...);
    // ...
    //
    // 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
    public static void main(String[] args) {
        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("Ivanov Ivan", "developer", "ivanov@mail.ru", "892312312", 15000, 32);
        empArr[1] = new Employee("Petrov Petr", "manager", "petrov@mail.ru", "899946575", 33000, 30);
        empArr[2] = new Employee("Sidorov Gennady", "designer", "sidorov@mail.ru", "896987654", 35000, 42);
        empArr[3] = new Employee("Semenov Sergey", "developer", "semyenov.s@mail.ru", "895634566", 31000, 45);
        empArr[4] = new Employee("Sobolev Evgeny", "programmer", "evgeny.sobol@mail.ru", "8923123553", 25000, 35);

        for (int i = 0; i < empArr.length; i++) {
            if (empArr[i].getAge() > 40) {
                empArr[i].info();
            }
        }
    }
}