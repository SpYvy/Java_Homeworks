package homeworks.homework7;
/*
1. Расширить задачу про котов и тарелки с едой.
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт
(это сделано для упрощения логики программы).
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
*/
public class Plate {
    private int foodAmount;
    public Plate(int foodAmount) {
        this.foodAmount = foodAmount;
    }
    public void addFood(int foodToAdd) {
        this.foodAmount += foodToAdd;
        System.out.println("В тарелку добавлено " + foodToAdd + " ед. еды.");
    }
    public void decreaseFood(int foodToDecrease) {
        foodAmount -= foodToDecrease;
    }
    public int getFoodAmount() {
        return foodAmount;
    }
    public void info(){
        if (foodAmount == 0) {
            System.out.println("Тарелка пуста.");
        } else {
            System.out.println("Тарелка с едой содержит " + getFoodAmount() + " ед. еды.");
        }
    }
}
