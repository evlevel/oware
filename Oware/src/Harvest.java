class Harvest
{
	public void harvest(Pit pitToEmpty, Player player)
	{
		if (player.getWhichPlayer())
		{
			while (true)
			{
				int seedsInPit = pitToEmpty.getNumSeeds();
				if (pitToEmpty.getPitNumber() >= 6 && pitToEmpty.getPitNumber() <= 11) // The last sowed pit is in the "harvestable" pit
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
		else
    {
			while (true)
			{
				int seedsInPit = pitToEmpty.getNumSeeds();
				if (pitToEmpty.getPitNumber() >= 0 && pitToEmpty.getPitNumber() <= 5) // The last sowed pit is in the "harvestable" pit
				{
          
					if (seedsInPit == 2 || seedsInPit == 3)
					{
						player.addSeedsToOpponentStorehouse(seedsInPit);
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
  }
}
