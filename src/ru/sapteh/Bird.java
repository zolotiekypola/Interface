package ru.sapteh;

public class Bird extends Animal{
    private String loveSeason;
    public Bird (String loveSeason,int age,int weight,String name) {
        super(age, weight, name);
        this.loveSeason = loveSeason;
    }

    public String getLoveSeason() {
        return loveSeason;
    }

    public void setLoveSeason(String loveJob) {
        this.loveSeason = loveJob;
    }

    @Override
    public String drive() {
        return "Bird fly";
    }

    @Override
    public String eat() {
        return "Slithers";
    }

    @Override
    public String voice() {
        return "Car Car";
    }
    @Override

    public String toString(){
        return "Age: " + super.getAge() + "\n" +
                "Weight: " + super.getWeight() + "\n" +
                "Name: " + super.getName() + "\n" +
                "LoveSeason: " + getLoveSeason() + "\n" +
                "Eat: " + eat() + "\n" +
                "Drive: " + drive() + "\n" +
                "Voice: " + voice() + "\n";
    }
}
