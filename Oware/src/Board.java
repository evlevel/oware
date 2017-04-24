
public class Board
{
	private static Pit[] allPits;
	
	static
	{
		allPits = new Pit[12];

	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	public static Pit getPit(int pitnum)
	{
		return allPits[pitnum];
	}

}
