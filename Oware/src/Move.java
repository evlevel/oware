
public class Move
{
	private Board currentBoard;
	private int currentPosition;
	
	public void makeMoveUsingPitNum(Board board, int pitNum)
	{
		currentBoard = board;
		currentPosition = pitNum;
		int movableSeeds = currentBoard.getSeedTotalfromPit(pitNum);
		currentBoard.emptyPit(pitNum);
		for(int i=0; i<movableSeeds; i++)
		{
			if(currentBoard.isPitExcist(pitNum) == true)
			{
				currentBoard.putSeedInPit(1, pitNum);
			}
			else
			{
				//TO-DO thats it
			}
			
		}
	}

}