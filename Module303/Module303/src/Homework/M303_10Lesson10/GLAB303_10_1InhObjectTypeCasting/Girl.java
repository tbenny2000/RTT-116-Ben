package Homework.M303_10Lesson10.GLAB303_10_1InhObjectTypeCasting;

public class Girl extends Person {
    static double ageFactor = 1.3;

    public Girl(String aName) {
        name = "Ms. " + aName;
    }

    public String talk() {
        return("Hello! " + jump());
    }

    public String jump() {
        return("I am jumping.");
    }

    public static double lifeSpan() {
        return(lifeSpan * ageFactor);
    }
}
