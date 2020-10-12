package ru.sapteh;

public abstract class Animal implements Eat,Drive,Voice{
    private int age;
    private int weight;
    private String name;

    public Animal(){}
    public Animal(int age,int weight,String name){
        this.age=age;
        this.weight=weight;
        this.name=name;
    }
    public Animal(int age,int weight){
        this.age=age;
        this.weight=weight;
    }
    public Animal(int age){
        this.age=age;
    }
    public Animal(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }


}
