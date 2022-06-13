package homeworks.homework6;

public class Cat extends Animals {
    /*
     * 1. Создать классы Собака и Кот с наследованием от класса Животное.
     * 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
     * Результатом выполнения действия будет печать в консоль.
     * (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
     * 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
     */
    public Cat(String name) {
        this.name = name;
        this.maxRunDistance = 200;
        this.maxSwimDistance = 0;
    }
}
