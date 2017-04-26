
public class Pit
{
	private int numSeeds;
	private Pit next; 
	private Pit previous; 
	private int pitNumber;

	public Pit()
	{
		numSeeds= 4;
		pitNumber = pnum;
	}
	public void setPrevious(Pit p){
		previous = p;
	}

	public int getNumSeeds()
	{
		return this.numSeeds;
	}
	public int getAllSeed(){
		int temp = numSeeds;
		numSeeds = 0;
		return temp;
		
	}
	public void sowOneSeed()
	{
		
	}
	public void setNumSeeds(int num)
	{
		this.numSeeds = num;
	}

	public static void main(String[] args)
	{
		// test the Pit...

		Pit test = new Pit();
		test.setNumSeeds(4);

	}

}
