
public class Pit
{
	private int numSeeds;
	private final int ID;
	private Pit nextPit;
	private Pit prevPit;
	private final int rowNum;
	
	public Pit(int ID, int rowNum)
	{
		this.numSeeds = 4;
		this.ID=ID;
		this.rowNum=rowNum;
	}

	public int getNumSeeds()
	{
		return this.numSeeds;
	}

	public void setNumSeeds(int num)
	{
		this.numSeeds = num;
	}

	public Pit getNextPit() {
		return nextPit;
	}

	public void setNextPit(Pit nextPit) {
		this.nextPit = nextPit;
	}

	public Pit getPrevPit() {
		return prevPit;
	}

	public void setPrevPit(Pit prevPit) {
		this.prevPit = prevPit;
	}

	public int getID() {
		return ID;
	}

	public int getRowNum() {
		return rowNum;
	}
	
	/**
	 * return the pit number of the final pit
	 */
	
	public int startSowing() {
		int seedsToSow = this.numSeeds;
		StdOut.println("Sowing " + seedsToSow + " seeds.");
		this.numSeeds = 0;
		return this.nextPit.sowSeed(this.ID, seedsToSow);
	}
	
	/**
	 * sows one seed in a recursive wa
	 * @return the pit number of the last pit.
	 */
	private int sowSeed(int startID, int seedsToSow)
	{
		if(startID == this.ID)
		{
			return this.nextPit.sowSeed(startID, seedsToSow);
		}
		this.numSeeds++;
		if (seedsToSow == 1) {
			return this.ID;
		} else{
			StdOut.println("Processing next pit=> " + this.nextPit.getID());
			return this.nextPit.sowSeed(startID, --seedsToSow);
		}
	}

	public static void main(String[] args)
	{
		// test the Pit...

		Pit test = new Pit(3,1);
		test.setNumSeeds(4);

	}

}
