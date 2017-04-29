import java.util.InputMismatchException;
import java.util.Scanner;

class InController
{
	public int chooseHouse(Player player, Pit[] pits) throws Exception // Catching a input other than a number between 1 - 12
	{
		Scanner input = new Scanner(System.in);
		int choice = 0;
		
		if (player.getWhichPlayer()) // For player choosing from pits 1 - 6
		{
			while (true)
			{
				System.out.print("\nPlease a house from your side(1 - 6): ");
				while (true)
				{
					try
					{
						choice = input.nextInt();
					}
					catch (InputMismatchException e)
					{
						System.out.print("Invalid input. Enter again. ");
						System.out.print("\nPlease a house from your side(1 - 6): ");
						input.next();
					}

					if (choice != 0)
						break;
				}
				if (choice < 1 || choice > 6)
					System.out.print("Invalid input. Enter again. ");
				else if (pits[choice-1].getNumSeeds() == 0)
					System.out.print("House already empty. Enter again. ");
				else
					break;
			}
		}
		else // For player choosing from pits 7 - 12
		{
			while (true)
			{
				System.out.print("\nPlease a house from your side(7 - 12): ");
				while (true) //Catching
				{
					try
					{
						choice = input.nextInt();
					}
					catch (InputMismatchException e)
					{
						System.out.print("Invalid input. Enter again. ");	
						input.next();
					}
					if (choice != 0)
						break;
				}
				if (choice < 6 || choice > 12)
					System.out.print("Invalid input. Enter again. ");	
				else if (pits[choice-1].getNumSeeds() == 0)
					System.out.print("House already empty. Enter again. ");
				else
					break;
			}
		}
		
		return choice - 1; //Since we using an array for pits
	}
}
