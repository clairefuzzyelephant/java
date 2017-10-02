import java.util.Scanner;

public class birthdays{

	public static void main(String[] args){


		Scanner note = new Scanner(System.in);
		System.out.println("How many people? ");
		int people = note.nextInt();

		double counter = 0; //count number of times multiple people share same bday
		int bigcount = 0; //to count # of simulations

		int[] birth = new int[people]; //initialize array

		while (bigcount < 1234500){

			for (int i = 0; i < people; i++){

				birth[i] = (int)(Math.random() * 366); //creating array of bdays
			}

			outer: for (int i =people -1; i > 0; i--){ //checking matches

				for (int m = 0; m < i; m++){

					if (birth[m] == birth[i]){

						counter += 1;
						break outer;

						}
					}
				}
			bigcount +=1;
			}
		System.out.println(counter/(double)(bigcount));
	}
}