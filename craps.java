/* Game of craps: roll two die, if you get 7 or 11, you win.
If you get 2, 3, 12, you lose.
4, 5, 6, 8, 9, 10

The first roll: come out roll - if you get 7, 11 you win. 
if you get 2 3 12 you lose.
If you get neither, that number becomes the point.
Keep rolling- if you get the point before the 7, you win.
If you get 7 before the point, you lose.
2 3 12 don't matter anymore, neither does 11.
Find probability that you win.
*/

public class craps{
	public static void main(String[] args){

		int counter = 0;
		double wins = 0;
		while (counter <= 12341234){

		int dice1 = (int)(6*Math.random()) + 1;
		int dice2 = (int)(6*Math.random()) + 1;

		int sum = dice1+ dice2;


		if (sum == 7 || sum == 11){
			wins += 1;
		}

		else if (sum == 2 || sum == 12 || sum == 3){
			//wins +=0;
		}

		else{
			int point = sum;
		

		dice1 = (int)(6*Math.random()) + 1;
		dice2 = (int)(6*Math.random()) + 1;

		sum = dice1+ dice2;

		while (true){
			dice1 = (int)(6*Math.random()) + 1;
			dice2 = (int)(6*Math.random()) + 1;

			sum = dice1+ dice2;
			if (sum == point){
				wins +=1;
				break;
			}
			else if (sum == 7){
				break;
			}
		}
	}
	counter +=1;
}
		System.out.println(wins/12341234.0);
	}
}