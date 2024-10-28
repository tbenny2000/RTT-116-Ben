package org.perscholas.SBA.Question2;

import java.util.HashSet;
import java.util.Set;

class Football implements Sport{
    private Set<Integer> retiredPlayers = new HashSet<>();

    public Football() {
        retiredPlayers = new HashSet<>();
        System.out.println("A new football team has been formed");
    }

    @Override
    public void calculateAvgAge(int[] age) {
        if (age.length == 0) {
            System.out.println("No players in the team yet!");
            return;
        }
        int sum = 0;
        for (int a : age) {
            sum += a;
        }
        double avg = sum / (double) age.length;
        // Print the average age formatted to two decimal places
        System.out.printf("The average age of the team is %.2f%n", avg);
    }

    @Override
    public void retirePlayer(int id) {
        if (retiredPlayers.add(id)) {
            System.out.println("Player with id: " + id + " has retired");
        } else {
            System.out.println("Player with id: " + id + " has already retired");
        }
    }

    public void playerTransfer(int fee, int id) {
        if (retiredPlayers.add(id)) {
            System.out.println("Player with id: " + id + " has retired");
        } else {
            System.out.println("Player with id: " + id + " has been transferred with a fee of " + fee);
        }
    }
}
