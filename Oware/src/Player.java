class Player
{
	private int playerStorehouse;
	private boolean side; // true for side 1 - 6, false for side 7 - 12

	
	
	public Player(int playerNumber)
	{
		this.playerStorehouse = 0;
		if (playerNumber == 1)
			this.side = true;
		else
			this.side = false;

	}
	
	public int getPlayerStorehouse()
	{
		return this.playerStorehouse;
	}
	
	public void addSeedsToPlayerStorehouse(int s)
	{
		this.playerStorehouse += s;
	}
	
	public boolean getWhichSide()
	{
		return this.side;
	}
}
