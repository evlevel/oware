
public class Player
{

	private int playerStorehouse;
	private int opponentStorehouse;
	private boolean whichPlayer; // true for player, false for opponent.
	
	public Player()
	{
		playerStorehouse = 0;
		opponentStorehouse = 0;
		whichPlayer = true;
	}
	
	public int getPlayerStorehouse()
	{
		return playerStorehouse;
	}
	
	public void setPlayerStorehouse(int s)
	{
		playerStorehouse += s;
	}
	
	public int getOpponentStorehouse()
	{
		return opponentStorehouse;
	}
	
	public void setOpponentStorehouse(int s)
	{
		opponentStorehouse += s;
	}
	
	
	public boolean getWhichPlayer()
	{
		return whichPlayer;
	}
	public void alternatePlayer()
	{
		whichPlayer = !whichPlayer;
	}

}
