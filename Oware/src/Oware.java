
public class Oware
{
	private static Board board;
	public static Controller controller; 
	public static void main(String[] args)
	{
		StdOut.println("Welcome to Oware.");
		StdOut.println("Each student will fork the starting");
		StdOut.println("https://github.com/evlevel/oware repo");
		StdOut.println("into their own GitHub clone...");
		StdOut.println("Intializating...");
		board = new Board(); 
		controller= new Controller (board);
		StdOut.println("make a move with pit 0");
		controller.makeMoveStartingAt(0);

	}

}
