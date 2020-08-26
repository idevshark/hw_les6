import animals.Cat;
import animals.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Жучка", 5, "мясо", "акита", false, true);
        dog.startPR();

        Cat cat = new Cat("Мурка", 3, "молоко", "британец", true, false);
        cat.startPR();

    }
}
