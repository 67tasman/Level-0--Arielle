import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String word = JOptionPane.showInputDialog("What kind of room has no doors or windows?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (word.equalsIgnoreCase("mushroom")){
	JOptionPane.showMessageDialog(null, "CORRECT");
	score++;
		// 5. Otherwise, say "wrong" and tell them the answer
}
else if (word.equalsIgnoreCase("a mushroom")){
	JOptionPane.showMessageDialog(null, "CORRECT");
	score++;
}
else{
	JOptionPane.showMessageDialog(null, "wrong.");
}
		// 6. Add some more riddles

String word1 = JOptionPane.showInputDialog("What part of the Turkey has the most feathers?");

if (word1.equalsIgnoreCase("outside")){
JOptionPane.showMessageDialog(null, "CORRECT");
score++;

}
else if (word1.equalsIgnoreCase("the outside")){
	JOptionPane.showMessageDialog(null, "CORRECT");
	score++;
}
else{
JOptionPane.showMessageDialog(null, "wrong.");
}

// word 2
String word2 = JOptionPane.showInputDialog("Can you find a 10 letter word in English language which can be typed using only the 1st rows of the computer keyboard ?");

if (word2.equalsIgnoreCase("typewriter")){
JOptionPane.showMessageDialog(null, "CORRECT");
score++;
}
else{
JOptionPane.showMessageDialog(null, "wrong.");
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}

