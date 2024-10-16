package Homework.M303_10Lesson10.PA303_10_1PolyAndInheritance;

public class WaterMonster extends Monster {

    public WaterMonster(String name) {
        super(name);
    }

    @Override
    String attack() {
        return "Attack with water!";
    }
}
