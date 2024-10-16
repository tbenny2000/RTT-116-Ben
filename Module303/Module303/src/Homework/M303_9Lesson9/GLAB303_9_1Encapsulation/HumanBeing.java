package Homework.M303_9Lesson9.GLAB303_9_1Encapsulation;

public class HumanBeing {

    private float weight;
    private float height;
    private float bmi;

    // Constructor with parameters
    public HumanBeing(float weight, float height, float bmi) {
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
    }

    // default constructor
    public HumanBeing() {
    }

    // Getters and setters
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getBmi() {
        return bmi;
    }
    public void setBmi(float bmi) {
        this.bmi = bmi;
    }
}
