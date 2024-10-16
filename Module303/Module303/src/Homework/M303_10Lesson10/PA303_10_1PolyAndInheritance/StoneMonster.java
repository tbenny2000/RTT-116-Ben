package Homework.M303_10Lesson10.PA303_10_1PolyAndInheritance;

public class StoneMonster extends Monster {

    public StoneMonster(String name) {
        super(name);
    }

    @Override
    String attack() {
        return "Attack with stones!";
    }
}
