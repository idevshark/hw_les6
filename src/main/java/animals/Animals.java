package animals;

public class Animals {
    private String animalType;
    private String animalName;
    private String voice;
    private String food;
    private int speed;
    private boolean climb;
    private boolean swim;

    public Animals() {

    }

    public Animals(int speed, String food, boolean climb, boolean swim) {
        this.speed = speed;
        this.food = food;
        this.climb = climb;
        this.swim = swim;
    }

    public void speak() {
        System.out.println("Зверек " + animalType + " по кличке " + animalName + " говорит " + voice + "!");
    }

    public void move() {
        System.out.println("Мне нравится двигаться со скоротью " + speed);
    }

    public void eat() {
        System.out.println("Я люблю кушать " + food);
    }

    public void startPR() {
        speak();
        eat();
        move();

    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public boolean isClimb() {
        return climb;
    }

    public void setClimb(boolean climb) {
        this.climb = climb;
    }

    public boolean isSwim() {
        return swim;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }
}
