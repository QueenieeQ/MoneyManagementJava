package queeniee.moneymanagement;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author QueenieeQ
 * @version 2.1
 * Main class accesses the Data class, Cost Manager, and the FileManager
 * @param file - an object of FileManager, which deals with all the file managing operations.
 * 
 * */
public class MenuUI {

	public static void main(String[] args) throws IOException {
		//System.out.println("Enter the password:");
                //Testing commit to github
		Scanner input = new Scanner(System.in);
		int ch;
		char userChoice = 'N';
		PassWord pass = new PassWord();
		if(pass.checkPassWord() == true	){
			do{
                                showMenu();
				//System.out.print("\n Options available are: \n1. Make an Entry \n2. Get the expenses done for a particular date \n3. Get the log for a particular month \n4. Check Expense done for a particular month  \n5. Set budget \n6. Delete a particular month's log \n7. Change Password \n Enter your choice: ");
				//System.out.print("Enter Your Choice");
                                ch = input.nextInt();
				Manager manage = new Manager();
				switch(ch)
				{
				case 1:
					//getting the data from the user, and updating 
					manage.makeDailyLog();
					break;
				case 2: 
					//Get the expense details for a particular date
					manage.getDayExpenseDetails();
					break;
				case 3:
					//Get a particular month's log
					manage.getMonthExpenseDetails();
					break;
				case 4:
					// Display the expense done till date to the user
					manage.displayMonthExpense();
					break;
				case 5:
					// Set the budget for the month
					manage.setBudget();
					break;
				case 6:
					// Delete a complete log
					manage.deleteMonthLog();
					break;
				case 7:
					//Change password
					pass.changePassWord();
				}
				System.out.println("\nAnything Else?(y/n): ");
				userChoice  = input.next().charAt(0);
				}while(userChoice == 'y' || userChoice == 'Y' );
		}
		else
			System.out.print("The entered password is incorrect! ");
		input.close();
	}
public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Make an Entry");
        System.out.println("2. Get the expenses done for a particular date.");
        System.out.println("3. Get the log for a particular month.");
        System.out.println("4. Check Expense done for a particular month.");
        System.out.println("5. Set budget");
        System.out.println("6. Delete a particular month's log");
        System.out.println("7. Change Password");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.println("Please choose: ");
    }
}
