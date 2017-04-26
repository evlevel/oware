
public class Pit
{
	private int numSeeds;
	private Pit next; 
	private Pit previous; 
	private int pitNumber;

	public Pit(int pnum)
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
	public void setNext(Pit p){
		next= p;
	}
	public Pit getNext(){
		return next;
	}
	public Pit getPrevious(){
		return previous;
	}
	public int getPitNumber(){
		return pitNumber;
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

		Pit test = new Pit(12);
		test.setNumSeeds(4);

	}

}
