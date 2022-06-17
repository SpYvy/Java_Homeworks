package homeworks.homework6;

public class Main {
    public static void main(String[] args) {
        Cat catBarsik = new Cat("Барсик");
        Dog dogBobik = new Dog("Бобик");

        catBarsik.run(250);
        catBarsik.run(100);
        catBarsik.swim(100);

        dogBobik.run(600);
        dogBobik.run(300);
        dogBobik.swim(8);
        dogBobik.swim(15);
    }
}
