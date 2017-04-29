
public class Move
{
	public Pit sow(int pitChoice, Pit[] pits)
	{
		
		int seedsToSow = pits[pitChoice].getAllSeeds();
		Pit pitToSow = pits[pitChoice];
		
		while(seedsToSow > 0)
		{
			
			pitToSow = pitToSow.getNext();
			pitToSow.sowOneSeed(); //Here we start sowing from the next pit of chosen pit
			seedsToSow --;
		}
		
		Pit lastSowedPit = pitToSow; //For the sake of understanding why return a Pit object
			
		return lastSowedPit;
	}
}
