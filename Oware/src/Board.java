
public class Board
{
	private Pit[] allPits;
	private Board opponentBoard;
	
	Board()
	{
		allPits = new Pit[6];
		for(int i=0; i<allPits.length; i++)
		{
			allPits[i].setNumSeeds(4);
		}
	}

	public Pit getPit(int pitnum)
	{
		return allPits[pitnum];
	}

	public Board getOpponentBoard() {
		return opponentBoard;
	}

	public void setOpponentBoard(Board opponentBoard) {
		this.opponentBoard = opponentBoard;
	}

	public int getSeedTotalfromPit(int pitNum)
	{
		return allPits[pitNum].getNumSeeds();
	}
	
	public void emptyPit(int pitNum)
	{
		allPits[pitNum].setNumSeeds(0);
	}
	
	public boolean isPitExcist(int pitNum)
	{
		if(pitNum >= allPits.length || pitNum < 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public void putSeedInPit(int numSeeds, int pitNum)
	{
		int newSeeds = allPits[pitNum].getNumSeeds();
		newSeeds = newSeeds + numSeeds;
		allPits[pitNum].setNumSeeds(newSeeds);
	}
}
