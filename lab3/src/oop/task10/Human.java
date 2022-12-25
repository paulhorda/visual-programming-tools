package oop.task10;

import oop.task11.Speakable;

public class Human implements Speakable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private String gender;
    private int growth;
    private int weight;

    public Human(String name, String gender, int growth, int weight) {
        this.name = name;
        this.gender = gender;
        this.growth = growth;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", growth=" + growth +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void greeting() {
        System.out.println("Hello");
    }

    @Override
    public void parting() {
        System.out.println("Buy");
    }

    @Override
    public void congratulation() {
        System.out.println("Congratulation");
    }
}
