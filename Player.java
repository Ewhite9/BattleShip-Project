import javax.lang.model.util.ElementScanner14;

//each player will have an instance of this class
public class Player {
    private char[][] playerBoard;
    private char[][] oppBoard;
    private Role role;
    
    public Player()
    {
        playerBoard = new char[10][10];
        oppBoard = new char[10][10];


        role = new Server();
    }

    //sets up both boards to all "~"
    public void setupBoards(String which)
    {
        for(int i=0; i<10; i++)
            {
                for(int j=0; j<10; j++)
                {
                    playerBoard[i][j] = '~';
                    oppBoard[i][j] = '~';
                }
            }
    }

    //update current gameboard (which = "Player" or "Opponent")
    public void shoot(String which, int x, int y)
    {
        if(which == "Player")
        {
            //update board to missed shot or ship hit, send to opponent
        }
        else if(which == "Oppenent")
        {
            //send shot to opponent, update board to hit/miss based on response
        }
        else
        {}
    }

    //print current gameboard to console (which = "Player" or "Opponent")
    public void printBoard(String which)
    {
        if(which == "Player")
        {
            System.out.println("You");
            System.out.println("----------");
            System.out.println(" ABCDEFGHIJ");
            for(int i=0; i<10; i++)
            {
                System.out.printf("%d", i);
                for(int j=0; j<10; j++)
                {
                    System.out.printf("%c", playerBoard[i][j]);
                }
                System.out.println();
            }
        }
        else if(which == "Opponent")
        {
            System.out.println("Opponent");
            System.out.println("----------");
            System.out.println(" ABCDEFGHIJ");
            for(int i=0; i<10; i++)
            {
                System.out.printf("%d", i);
                for(int j=0; j<10; j++)
                {
                    System.out.printf("%c", oppBoard[i][j]);
                }
                System.out.println();
            }
        }
        else
        {}
    }
}
