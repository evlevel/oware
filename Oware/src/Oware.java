
public class Oware
{
	private static Player player1, player2;
	private static Pit[] pits;
	private static Board board;
	private static boolean haveWinner;
	private static InController choices;
	private static Harvest doHarvest;
	private static Move doSow;
	
	public static void main(String[] args) throws Exception
	{
		StdOut.println("Welcome to Oware.");
		StdOut.println("Each student will fork the starting");
		StdOut.println("https://github.com/evlevel/oware repo");
		StdOut.println("into their own GitHub clone...");
		
		StdOut.println("Initializing...");
		
		initialize();
		pits = board.getAllPits();
		
		System.out.println("            Oware Game 1.0");
		System.out.println("-------------------------------------------\n");
		showBoard();
		
		while (!haveWinner)
		{
			int pitChoice = choices.choosePit(player1, pits);
			doHarvest.harvest(doSow.sow(pitChoice, pits), player1);
			showBoard();
			
			
			System.out.println("---------");
			System.out.println("Switch Player");
			System.out.println("---------");
			
			
			pitChoice = choices.choosePit(player2, pits);

			doHarvest.harvest(doSow.sow(pitChoice, pits), player2);
			showBoard();
			
			if (player1.getPlayerStorehouse() > 24)
			{
				System.out.println("-----------------------------");
				System.out.println("       Player 1 WINS!");
				System.out.println("-----------------------------");
				haveWinner = true;
			}
			else if(player2.getPlayerStorehouse() > 24)
			{
				System.out.println("-----------------------------");
				System.out.println("       Player 1 WINS!");
				System.out.println("-----------------------------");
				haveWinner = true;
			}
		}
		

		System.out.println("Thank you for playing.");
		
		
	}
	
	private static void initialize()
	{
		player1 = new Player(1);
		player2 = new Player(2);
		board = new Board();
		haveWinner = false;
		choices = new InController();
		doHarvest = new Harvest();
		doSow = new Move();
	}
	
	private static void showBoard()
	{
		System.out.println("       12    11   10   9    8    7");
		System.out.print("       ");
		for (int i = 11;i > 5; i-- )
			System.out.print("(" + pits[i].getNumSeeds() + ")  ");
		System.out.println("\n(" + player1.getPlayerStorehouse() + ")" +"--------------------------------------" + "(" + player2.getPlayerStorehouse() + ")");
		System.out.print("       ");
		for (int i = 0;i < 6; i++ )
			System.out.print("(" + pits[i].getNumSeeds() + ")  ");
		System.out.println("\n        1    2    3    4    5    6");
	}
	

}
