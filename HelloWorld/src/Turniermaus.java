import java.util.Scanner;

class Tuniermaus {

    public Mannschaft[] teams = new Mannschaft[6];

    public void update() {

        Scanner tastatur = new Scanner(System.in);

        for( int i = 0; i < teams.length; i++) {

            System.out.println("Input the points of the " + teams[i].name);

            teams[i].points += tastatur.nextInt();
        }
    }

    public void getBestTeam() {

        Mannschaft bestTeam = new Mannschaft("Default");
        for (int i = 0; i < teams.length; i++) {
            if (teams[i].points > bestTeam.points) {
                bestTeam = teams[i];
            }
        }

        System.out.println("The best team is: " + bestTeam.name + " with a score of: " + String.valueOf(bestTeam.points));

    }

    public Tuniermaus() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Whats the name of the " + (i+1) + ". team?");
            Scanner input = new Scanner(System.in);

            teams[i] = new Mannschaft(input.nextLine());
        }
    }

    public void sortTeams() {
        boolean swapped = false;
        do {
            swapped = false;
           for(int i = 1; i < teams.length; i++) {
               if (teams[i].points > teams[i - 1].points) {

                   Mannschaft tempTeam = teams[i - 1];
                   teams[i - 1] = teams [i];
                   teams[i] = tempTeam;

                   swapped = true;
               }
           }
        } while (swapped == true);
    }

    public void print() {
        System.out.println("LEADERBOARD:");
        for( int i = 0; i < teams.length; i++) {
            System.out.println((i+1) + ". team is: " + teams[i].name + " with a score of:" + teams[i].points);
        }
    }
}