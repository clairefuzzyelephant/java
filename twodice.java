import java.util.Scanner;

//Probability of rolling a 5 or 7 for a pair of die.

public class twodice{
	public static void main(String[] args){
		Scanner note = new Scanner(System.in);
		System.out.print("How many times are you rolling the die? ");
		double rolls = note.nextDouble();
		int dice1;
		int dice2;
		int counter = 0;
		double fiveorseven = 0;
		while (counter <= rolls){
			dice1 = (int)(6 * Math.random()) + 1;
			dice2 = (int)(6 * Math.random()) + 1;
			int sum = dice1 + dice2;
			if (sum == 7 || sum == 5){
				fiveorseven = fiveorseven + 1;
			}
			counter = counter + 1;
	}
		System.out.println(fiveorseven/rolls);
	}
}