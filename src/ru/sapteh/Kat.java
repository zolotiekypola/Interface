package ru.sapteh;

public class Kat extends Animal{
    private String loveGame;
    public Kat (String loveGame,int age,int weight,String name) {
        super(age, weight, name);
        this.loveGame = loveGame;
    }

    public String getLoveGame() {
        return loveGame;
    }

    public void setLoveGame(String loveGame) {
        this.loveGame = loveGame;
    }

    @Override
    public String eat() {
        return "Milk";
    }

    @Override
    public String drive() {
        return "Cat goes";
    }

    @Override
    public String voice() {
        return "miu miu";
    }
    @Override

    public String toString(){
        return "Age: " + super.getAge() + "\n" +
                "Weight: " + super.getWeight() + "\n" +
                "Name: " + super.getName() + "\n" +
                "LoveTimeToGame: " + getLoveGame() + "\n" +
                "Eat: " + eat() + "\n" +
                "Drive: " + drive() + "\n" +
                "Voice: " + voice() + "\n";
    }
}
