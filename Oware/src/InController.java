import java.util.InputMismatchException;
import java.util.Scanner;

class InController
{
	public int choosePit(Player player, Pit[] pits) throws Exception // Catching a input other than a number between 1 - 12
	{
		Scanner input = new Scanner(System.in);
		int choice = 0;
		

			while (true)
			{
				showPitToSelect(player);
				while (true)
				{
					try
					{
						choice = input.nextInt();
					}
					catch (InputMismatchException e)
					{
						System.out.print("Invalid input. Enter again. ");
						showPitToSelect(player);
						input.next();
					}

					if (choice != 0)
						break;
				}
				if (ifPitIsChoosable(choice, player))
					System.out.print("Invalid input. Enter again. ");
				else if (pits[choice-1].getNumSeeds() == 0)
					System.out.print("House already empty. Enter again. ");
				else
					break;
			}
		
		return choice - 1; //Since we using an array for pits
	}
	
	private void showPitToSelect(Player player)
	{
		if (player.getWhichSide())
			System.out.print("\nPlease a house from your side(1 - 6): ");
		else
			System.out.print("\nPlease a house from your side(7 - 12): ");
	}
	
	private boolean ifPitIsChoosable(int choice, Player player)
	{
		if (player.getWhichSide())
		{
			if (choice >= 7 && choice <= 11)
				return true;
			else 
				return false;
		}
		else
		{
			if (choice >= 1 && choice <= 6)
				return true;
			else
				return false;	
		}
	}
	
}
