import java.util.InputMismatchException;
import java.util.Scanner;

class InController
{
	public int chooseHouse(Player player, House[] houses) 
	{
		Scanner input = new Scanner(System.in);
		int choice = 0;
		
		if (player.getWhichPlayer())
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
				else if (houses[choice-1].getSeedsCount() == 0)
					System.out.print("House already empty. Enter again. ");
				else
					break;
			}
		}
		else
		{
			while (true)
			{
				System.out.print("\nPlease a house from your side(7 - 12): ");
				while (true)
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
				else if (houses[choice-1].getSeedsCount() == 0)
					System.out.print("House already empty. Enter again. ");
				else
					break;
			}
		}
		
		return choice - 1;
	}
}
