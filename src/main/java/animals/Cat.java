package animals;

import possibility.Climb;
import possibility.Swim;

public class Cat extends Animals implements Climb, Swim {

    private final String animalType = "Котенок";
    private final String voice = "мяу-мяу";
    private String animalName;
    private String breed;
    private Animals animals;

    public Cat(String animalName, int speed, String food, String breed, boolean climb, boolean swim) {
        super(speed, food, climb, swim);
        this.animals = new Animals();
        animals.setClimb(climb);
        animals.setSwim(swim);
        this.setAnimalType(animalType);
        this.setVoice(voice);
        this.setAnimalName(animalName);
        this.breed = breed;
    }

    public void Climb() {
        System.out.println("Я " + (animals.isClimb() ? "скалолаз" : "сижу под деревом, т.к не умею лазать по деревьям"));
    }

    public void Swim() {
        System.out.println("Я " + (animals.isSwim() ? "плавеец" : "сижу на берегу, так как не умею плавать"));
    }

    public void printBread() {
        System.out.println("Моя порода " + breed);
    }

    @Override
    public void startPR() {
        super.startPR();
        Climb();
        Swim();
        printBread();
    }
}
