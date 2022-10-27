import java.util.Scanner;

public class Battleship {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        Player localPlayer = new Player();

        //setting up which is server and which is client
        while(localPlayer.getRole() != "Server" || localPlayer.getRole() != "Client")
        {
            System.out.println("Server or Client?");
            String playerRole = scan.next();

            if(playerRole == "Server" || playerRole == "server")
            {
                localPlayer.setRole(new Server());
            }
            else if (playerRole == "Client" || playerRole == "client")
            {
                localPlayer.setRole(new Client());
            }
            else
            {
                System.out.println("Invalid Input: Please enter 'Server' or 'Client'!");
            }
        }

        localPlayer.setState(new SetupState());

    }
}
