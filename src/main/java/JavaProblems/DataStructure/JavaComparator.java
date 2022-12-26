package JavaProblems.DataStructure;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Player[] players = new Player[n];
        Checker checkers = new Checker();


        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        System.out.println("Before Sorting : " + Arrays.toString(players));

        System.out.println("After Sorting :");

        Arrays.sort(players,checkers);

        for (int i = 0; i < players.length; i++) {
            System.out.printf("%s %s\n", players[i].name, players[i].score);
        }
    }


}

class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if (o1.score != o2.score) {
            return o2.score - o1.score;
        } else {
            return o1.name.compareTo(o2.name);
        }

    }
}

