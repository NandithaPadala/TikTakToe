import board.Board;
import player.Player;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
        
        Board b = new Board(3,'@');
        b.printBoardConfig();

        Scanner sc = new Scanner(System.in);

        //PLAYER ONE
        Player p1 = new Player();
        System.out.print("Enter the player name and address: ");;
        p1.setPlayerNameandAdd(sc.nextLine(), sc.nextLine());
        System.out.println("Player Name: " + p1.getPlayerName());
        System.out.println("Player Address: " + p1.getPlayerAddress());

        // p.setPlayerDetalis("Rahul Bhattacharghi", "Aadivaram Peta, Srikakulam", "4537579477", "rahhul123@gmail.com", '-', 25);
        // p.getPlayerDetails();

        System.out.print(p1.getPlayerSymbol());
        p1.changeSymbol('X');
        System.out.println(p1.getPlayerSymbol());

        //PLAYER TWO
        Player p2 = new Player();
        System.out.println("Enter the player name and address");
        p1.setPlayerNameandAdd(sc.nextLine(), sc.nextLine());
        System.out.println("Player Name: " + p2.getPlayerName());
        System.out.println("Player Address: " + p2.getPlayerAddress());

        // p.setPlayerDetalis("Rahul Bhattacharghi", "Aadivaram Peta, Srikakulam", "4537579477", "rahhul123@gmail.com", '-', 25);
        // p.getPlayerDetails();

        System.out.println(p2.getPlayerSymbol());
        p1.changeSymbol('O');
        System.out.println(p2.getPlayerSymbol());
        sc.close();
    }
}
