
public class Board
{
	private static  Pit[] allPits; 
	
	public Board()
	{
		allPits = new Pit[12];
		
		for(int i = 0; i<12; i++)
		{
			allPits[i]= new Pit(i);

		}
			for (int i= 0; i< 12; i++){

			allPits[i].setNext(allPits[(i+1)%12]);
			allPits[i].setPrevious(allPits[(12+i-1)%12]);
		}

	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	
}


	public static Pit getPit(int pitnum)
	{
		return allPits[11];
	}

}
	
