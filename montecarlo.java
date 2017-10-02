/* monte carlo integration is when you pick a number of points, N, 
that lie within a rectangle of width b-a and a height M where
M is greater than all y-values of f(x) between a and b.
By finding the ratio of points under the curve, n, to total points N,
multiplied by the area of the rectangle,
you can find the area under the curve.
*/

import java.util.Scanner;

public class montecarlo{
	public static void main(String[] args){

//creating input 
		Scanner note = new Scanner(System.in);
		System.out.print("How many points are you testing? ");
		double totalpt = note.nextDouble();

		System.out.print("Choose left bound: ");
		double a = note.nextDouble();

		System.out.print("Choose right bound: ");
		double b = note.nextDouble();

//limiting the values of M
		double largest = (double)(Math.exp(a * -a));

		for (double q = a; q <= b; q += 0.0001){
			double yvalex = (double)(Math.exp(q * -q));
			if (yvalex > largest){
				largest = yvalex;
			}
		}System.out.print("The largest y-value is: ");
		System.out.println(largest);
		System.out.println("You must pick a height above this value.");

		System.out.print("Choose the height of your rectangle: ");
		double height = note.nextDouble();
		while (height <= largest){
			System.out.println("Your chosen height must be over the curve. Try again: ");
			height = note.nextDouble();
		}
//randomly selecting points
		double placepts = 0;
		double n = 0;

		while (placepts <= totalpt){
			placepts += 1.0;
			double xval = (double)(a + ((b-a) * Math.random()));
			double yval = (double)(Math.random() * height);

			if (yval <= (double)(Math.exp(xval * -xval))){
				n += 1.0;
			}
		} System.out.println(n);
		System.out.print("The area under the curve is approximately ");
		System.out.println((n/totalpt)*(b-a)*height);

	}
}