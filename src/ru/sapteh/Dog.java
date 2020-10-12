package ru.sapteh;

public class Dog extends Animal {
    private String loveTimeGame;
    public Dog (String loveTimeGame,int age,int weight,String name){
        super(age,weight,name);
        this.loveTimeGame = loveTimeGame;
    }

    public String getLoveEat() {
        return loveTimeGame;
    }

    public void setLoveEat(String loveEat) {
        this.loveTimeGame = loveEat;
    }


    @Override
    public String eat() {
        return "Meat";
    }

    @Override
    public String drive() {
        return "Dog goes";
    }

    @Override
    public String voice() {
        return "Gav Gav";
    }
    @Override

    public String toString(){
        return "Age: " + super.getAge() + "\n" +
                "Weight: " + super.getWeight() + "\n" +
                "Name: " + super.getName() + "\n" +
                "LoveTimeToGame: " + getLoveEat() + "\n" +
                "Eat: " + eat() + "\n" +
                "Drive: " + drive() + "\n" +
                "Voice: " + voice() + "\n";
    }

}
