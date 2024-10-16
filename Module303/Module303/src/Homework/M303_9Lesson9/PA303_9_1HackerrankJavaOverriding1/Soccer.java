package Homework.M303_9Lesson9.PA303_9_1HackerrankJavaOverriding1;

public class Soccer extends Sports{

    @Override
    String getName() {
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}
