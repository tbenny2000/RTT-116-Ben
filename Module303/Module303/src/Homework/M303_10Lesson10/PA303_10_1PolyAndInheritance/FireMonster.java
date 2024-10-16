package Homework.M303_10Lesson10.PA303_10_1PolyAndInheritance;

public class FireMonster extends Monster {

    public FireMonster(String name) {
        super(name);
    }

    @Override
    String attack() {
        return "Attack with fire!";
    }

}
