package Homework.M303_9Lesson9.PA303_9_1HackerrankJavaOverriding1;

public class Solution {
    public static void main(String []args){
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();

        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();

        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }
}
