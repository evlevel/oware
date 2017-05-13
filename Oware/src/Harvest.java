class Harvest
{
	public void harvest(Pit pitToEmpty, Player player)
	{
			while (true)
			{
				int seedsInPit = pitToEmpty.getNumSeeds();

				if (ifPitInHarvestableSide(pitToEmpty, player)) // The last sowed pit is in the "harvestable" pit
				{
					if (seedsInPit == 2 || seedsInPit == 3)
					{
						player.addSeedsToPlayerStorehouse(seedsInPit);
						pitToEmpty.emptyPit();
            			pitToEmpty = pitToEmpty.getPrevious();
					}
					else
						break;
				}
        
				else
					break;
			}				
		}

  
	
	private boolean ifPitInHarvestableSide(Pit pitToEmpty, Player player)
	{
		if (player.getWhichSide())
		{
			if (pitToEmpty.getPitNumber() >= 6 && pitToEmpty.getPitNumber() <= 11)
				return true;
			else 
				return false;
		}
		else
		{
			if (pitToEmpty.getPitNumber() >= 0 && pitToEmpty.getPitNumber() <= 5)
				return true;
			else
				return false;	
		}
	}
}
