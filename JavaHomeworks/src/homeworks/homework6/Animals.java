package homeworks.homework6;

public class Animals {
    /*
     * 1. Создать классы Собака и Кот с наследованием от класса Животное.
     * 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
     * Результатом выполнения действия будет печать в консоль.
     * (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
     * 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
     */
    String name;
    public int maxRunDistance;
    public int maxSwimDistance;

    public int getMaxRunDistance() {
        return this.maxRunDistance;
    }

    public int getMaxSwimDistance() {
        return this.maxSwimDistance;
    }

    public String getName() {
        return this.name;
    }

    public void run(int distanceToRun) {
        if (this.maxRunDistance == 0) {
            System.out.println(this.getName() + " не умеет бегать.");
        } else if (distanceToRun > this.maxRunDistance) {
            System.out.println(this.getName() + " не смог(ла) пробежать " + distanceToRun + " м.");
        } else {
            System.out.println(this.getName() + " пробежал(а) " + distanceToRun + " м.");
        }
    };

    public void swim(int distanceToSwim) {
        if (this.maxSwimDistance == 0) {
            System.out.println(this.getName() + " не умеет плавать.");
        } else if (distanceToSwim > this.maxSwimDistance) {
            System.out.println(this.getName() + " не смог(ла) проплыть " + distanceToSwim + " м.");
        } else {
            System.out.println(this.getName() + " проплыл(а) " + distanceToSwim + " м.");
        }
    }
}
