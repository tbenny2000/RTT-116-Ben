package Homework.M303_9Lesson9.GLAB303_9_1Encapsulation;

public class EncapsulationExample {
    public static void main(String[] args) {
        HumanBeing h1 = new HumanBeing();
        // using setter of HumanBeing
        h1.setHeight(1.75f);
        h1.setWeight(105);

        h1.setBmi(calculateBmi(h1));

        System.out.println("Person has " + h1.getHeight() + " kgs and is " + h1.getHeight() + " meters in height, which results in BMI of " + h1.getBmi());
    }
    public static float calculateBmi(HumanBeing h1) {
        return h1.getWeight() / (h1.getHeight() * h1.getHeight());
    }
}
