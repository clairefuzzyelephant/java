import java.util.Scanner;

public class faircoin{
	public static void main(String[] args){
		Scanner note = new Scanner(System.in);
		System.out.println("How many times do you flip the coin? ");
		double times = note.nextInt();
		double tails = 0;
		double heads = 0;
		double x;
		while (heads + tails <= times){
			x = Math.random();
			if (x > 0.5){
				tails = tails + 1;
			}	
			else if (x <= 0.5){
				heads = heads + 1;

			}
		}
		System.out.println(tails/(heads + tails));
}
}