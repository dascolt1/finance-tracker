
import java.util.Scanner;

public class FinanceTracker {

	public static void main(String[] args)  {

		Scanner scnr = new Scanner(System.in);
		
		boolean continues = true;
		Finance tommy = new Finance();
		

		menu();

		while(continues) {		
				
			int input = scnr.nextInt();



			if(input == 1) {
				System.out.println("Please enter how much money you earned:");
				double earned = scnr.nextDouble();
				tommy.setMoneyEarned(earned);
				System.out.println("Please enter how much money you spent/plan on spending:");
				double spent = scnr.nextDouble();
				tommy.setMoneySpent(spent);
				System.out.println("Is the following correct? Y/N?");
				System.out.println("Money earned:" + "$" + tommy.getMoneyEarned() + " " + "Money spent: " + "$" + tommy.getMoneySpent());

				String ye = scnr.next();
				if(ye.toLowerCase().equals("y")) menu();

				if(ye.toLowerCase().equals("n")) {

					//System.out.println("------------------------------------------------------");
					System.out.println(" ");
					System.out.println("Please click option 1 on the main menu and enter again");
					System.out.println(" ");
					//System.out.println("------------------------------------------------------");
					menu();
				}

			}else if(input == 2) {

				if(tommy.moneyAfterExpenses(tommy.getMoneyEarned(), tommy.getMoneySpent()) >= 0){
					System.out.println(" ");
					System.out.println("Money after expenses: " + "$" + tommy.moneyAfterExpenses(tommy.getMoneyEarned(), tommy.getMoneySpent()));
					System.out.println(" ");
					menu();
				}else {
					System.out.println("You owe: " + "$" + Math.abs(tommy.moneyAfterExpenses(tommy.getMoneyEarned(), tommy.getMoneySpent())));
					menu();
				}


				


			}else if(input == 3) {
				//TODO
				
				System.out.println("Please enter how many weeks you plan on working: ");
				double weeksWork = scnr.nextDouble();

				System.out.println(" ");
				System.out.println("Projected revenue after " + weeksWork + " week(s): $" + tommy.projectedRevenue(tommy.getMoneyEarned(), weeksWork)); 
				System.out.println(" ");

				menu();

			}else if(input == 4) {

				System.out.println(" ");
				System.out.println("Money earned: " + "$" + tommy.getMoneyEarned() + " " + "Money spent: " + "$" + tommy.getMoneySpent());
				System.out.println(" ");
				menu();

				
			}else if(input == 5) {

				System.out.println("Are you sure you'd like to quit the program? Y/N?");
				String y = scnr.next();

				if(y.toLowerCase().equals("n")) {
					menu();
				}else if(y.toLowerCase().equals("y")) {
					continues = false;
					System.out.println("Thank you for banking with Monty international. Your finances are very happy.");
				}else {
					System.out.println("Please choose Y or N.");
					menu();
				}

			}else {

				System.out.println(" ");
				System.out.println("Please enter a valid option!");
				System.out.println(" ");
				menu();
			}
				

		}

	}




	public static void menu() {
		System.out.println("     --------------------------------------");
		System.out.println("                      Menu");
		System.out.println(" Please enter number 1 to add money earned and spent");
		System.out.println(" Please enter number 2 to calculate money after expenses");
		System.out.println(" Please enter number 3 to calculate projected revenue");
		System.out.println(" Please enter number 4 to see how much you earned and spent");
		System.out.println(" Please enter number 5 to quit");
		System.out.println("     --------------------------------------");
		

	}
}	


