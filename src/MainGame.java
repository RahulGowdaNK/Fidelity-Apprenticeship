import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a game");
        String game = sc.nextLine();

        System.out.println("Enter MAX number of players");
        int players = sc.nextInt();
        sc.nextLine();

        Gameinheritance gameinheritance = new Gameinheritance(game, players);
        System.out.println(game.toString());
        System.out.println("Enter a the game that has a time limit");
        String timeLimitGameName = sc.nextLine();
        System.out.println("Enter the max number of players:");
        int maxPlayers = sc.nextInt();
        System.out.println("Enter the timelimit in minutes:");
        int timeLimit = sc.nextInt();


        Gmaewithtimelimit gmaewithtimelimit =new Gmaewithtimelimit(timeLimitGameName,maxPlayers,timeLimit);
        System.out.println(gmaewithtimelimit.toString());

    }
}
