
public class Oware
{
	private static Player player;
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
		showBoard(player, pits);
		
		while (!haveWinner)
		{
			int pitChoice = choices.choosePit(player, pits);
			
			doHarvest.harvest(doSow.sow(pitChoice, pits), player);
			showBoard(player, pits);
			player.alternatePlayer();
			
			/*
			 * Insert here.
			 */
			
			if (player.getPlayerStorehouse() > 24 || player.getOpponentStorehouse() > 24)
				haveWinner = true;
		}
		
		System.out.println("-----------------------------");
		System.out.println("     We have a WINNER!");
		System.out.println("-----------------------------");
		System.out.println("Thank you for playing.");
		
		
	}
	
	private static void initialize()
	{
		player = new Player();
		board = new Board();
		haveWinner = false;
		choices = new InController();
		doHarvest = new Harvest();
		doSow = new Move();
	}
	
	public static void showBoard(Player p, Pit[] pits)
	{
		System.out.println("       12    11   10   9    8    7");
		System.out.print("       ");
		for (int i = 11;i > 5; i-- )
			System.out.print("(" + pits[i].getNumSeeds() + ")  ");
		System.out.println("\n(" + p.getPlayerStorehouse() + ")" +"--------------------------------------" + "(" + p.getOpponentStorehouse() + ")");
		System.out.print("       ");
		for (int i = 0;i < 6; i++ )
			System.out.print("(" + pits[i].getNumSeeds() + ")  ");
		System.out.println("\n        1    2    3    4    5    6");
	}

}
