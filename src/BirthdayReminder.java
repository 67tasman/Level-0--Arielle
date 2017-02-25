 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 11th";
		String dadsBirthday = "August 20";
		String myBirthday = "June 21st";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String who = JOptionPane.showInputDialog("Whos birthday do you want?");
		// 3. Print out what the user typed
		System.out.println(who);
		// 4. if user asked for "mom"
		if (who.equalsIgnoreCase("mom"))
			//print mom's birthday
			System.out.println(momsBirthday);
		// 5. if user asked for "dad"
		if (who.equalsIgnoreCase("dad"))
			// print dad's birthday
			System.out.println(dadsBirthday);
		// 6. if user asked for your name
		if (who.equalsIgnoreCase("Arielle"))
			// print myBirthday
			System.out.println(myBirthday);
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else
			System.out.println("Sorry, i don't remember that person's birthday!");
			
	} 
}