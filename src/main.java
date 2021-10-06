import javax.lang.model.type.NullType;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random random=new Random();
        int nrnreader;
        System.out.println(" __    __    ___  _        __   ___   ___ ___    ___  __ \n" +
                "|  |__|  |  /  _]| |      /  ] /   \\ |   |   |  /  _]|  |\n" +
                "|  |  |  | /  [_ | |     /  / |     || _   _ | /  [_ |  |\n" +
                "|  |  |  ||    _]| |___ /  /  |  O  ||  \\_/  ||    _]|__|\n" +
                "|  `  '  ||   [_ |     /   \\_ |     ||   |   ||   [_  __ \n" +
                " \\      / |     ||     \\     ||     ||   |   ||     ||  |\n" +
                "  \\_/\\_/  |_____||_____|\\____| \\___/ |___|___||_____||__|");
            System.out.println(
                " _______  _______  __    _  _______  ___   __    _  __   __  _______  ______  \n" +
                        "|       ||       ||  |  | ||       ||   | |  |  | ||  | |  ||       ||      | \n" +
                        "|       ||   _   ||   |_| ||_     _||   | |   |_| ||  | |  ||    ___||___   | \n" +
                        "|       ||  | |  ||       |  |   |  |   | |       ||  |_|  ||   |___   __|  | \n" +
                        "|      _||  |_|  ||  _    |  |   |  |   | |  _    ||       ||    ___| |_____| \n" +
                        "|     |_ |       || | |   |  |   |  |   | | | |   ||       ||   |___    __    \n" +
                        "|_______||_______||_|  |__|  |___|  |___| |_|  |__||_______||_______|  |__| ");

        System.out.println("Yes/No:");
        String ustring = sc.next();
        String yes = "yes", no = "no";

        if (ustring.equalsIgnoreCase(no)) {
            System.out.println("Too bad!");
                System.out.print("\nInvalid number of players!The game will now close");
                for(int i=0;i<=3;++i){
                    System.out.print(".");
                    TimeUnit.SECONDS.sleep(1);
                }
                System.exit(0);
        }
        else if (ustring.equalsIgnoreCase(yes)) {
            System.out.println("  ____  ____     ___   ____  ______  __ \n" +
                    " /    ||    \\   /  _] /    ||      ||  |\n" +
                    "|   __||  D  ) /  [_ |  o  ||      ||  |\n" +
                    "|  |  ||    / |    _]|     ||_|  |_||__|\n" +
                    "|  |_ ||    \\ |   [_ |  _  |  |  |   __ \n" +
                    "|     ||  .  \\|     ||  |  |  |  |  |  |\n" +
                    "|___,_||__|\\_||_____||__|__|  |__|  |__|");

            System.out.println("\n How many players?\n1 players\n2 players\n3 players\n4 players");
            int players = 0;
            players=sc.nextInt();
            if (players > 4 || players < 0) {
                System.out.print("\nInvalid number of players!The game will now close");
                for(int i=0;i<=3;++i){
                    System.out.print(".");
                    TimeUnit.SECONDS.sleep(1);
                }
                System.exit(0);
                }
            switch (players) {
            case 1: System.out.println("Introduce your name!");
                    ustring=sc.next();
                    Player player1=new Player(ustring,0,false);
                    System.out.println("What do you wish to play?\n1.Trivia\n2.True or false");
                    TimeUnit.SECONDS.sleep(5);
                    nrnreader=sc.nextInt();
                    TriviaGames game=new TriviaGames(nrnreader,1);

                    Trivia trivia=new Trivia(10,5);
                    TrueFalse shadow=new TrueFalse(10,5);
                    game.gameTypeStarter(player1,trivia,shadow);

                    player1.scoreDisplay();

                    break;
                case 2:
                    PlayerBoard playerboard=new PlayerBoard(2);
                    System.out.println("What do you wish to play?\n1.Trivia\n2.True or false");
                    TimeUnit.SECONDS.sleep(5);
                    nrnreader=sc.nextInt();
                    playerboard.multiplePlayersGame(nrnreader);
              break;
              case 3:
                  PlayerBoard playerboard1=new PlayerBoard(3);
                  System.out.println("What do you wish to play?\n1.Trivia\n2.True or false");
                  TimeUnit.SECONDS.sleep(5);
                  nrnreader=sc.nextInt();
                  playerboard1.multiplePlayersGame(nrnreader);
                     break;
                case 4:
                  PlayerBoard playerboard2=new PlayerBoard(4);
                    System.out.println("What do you wish to play?\n1.Trivia\n2.True or false");
                    TimeUnit.SECONDS.sleep(5);
                    nrnreader=sc.nextInt();
                    playerboard2.multiplePlayersGame(nrnreader);
                    break;

            }
            System.out.println("\nTis is version 0.00001.,bugs fixing and more options come in the next patch!");
        }
        else{
            System.out.println("You haven't chose correctly!");
        }
    }
}
