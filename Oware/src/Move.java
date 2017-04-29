
public class Move
{
	private Board board;// return results from
	
	public Move(Board board)
	{
		this.board = board;
	}

	public static void main(String[] args)
	{
		

	}

	private boolean isValidToMovePit(Player player, Pit targetPit) {
		if(isPlayersPit(player, targetPit) && isNotEmptyPit(targetPit))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private boolean isNotEmptyPit(Pit pit) {
		
		if(pit.getNumSeeds() > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private boolean isPlayersPit(Player player, Pit pit) {
		if((player.isHuman() && pit.getID() < 6)
				|| (!player.isHuman() && pit.getID() >= 6))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean startMove(Player player, int pitNumber) {
		Pit active = board.getPit(pitNumber);
		if(isValidToMovePit(player, active))
		{
			int numSeeds = active.getNumSeeds();
			int lastPit = active.startSowing();
			return true;
		}
		else
		{
			return false;
		}
	}

}
