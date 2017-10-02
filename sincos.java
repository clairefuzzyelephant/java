import java.util.Scanner;

//finding sine and cosine of an input angle

public class sincos{
	public static void main(String[] args){

		Scanner note = new Scanner(System.in);
		System.out.println("Input your angle: ");
		double theta = note.nextDouble();

		double sign = -1;
		double sum = 0;
		int counter = 1;

		double m = 1;
		double thetapower = theta;

		while (true){

			sign = -sign;

			while (m < counter){
				thetapower = thetapower * theta;
				m = m + 1;
			}
			if (Math.abs(sign * thetapower / factorial.factor(counter)) < 0.0001){
				break;
			}
			sum = sum + sign * thetapower / factorial.factor(counter);
			counter += 2;

				
		}
		System.out.println("sin(" + theta + ") is " + sum);
		System.out.println("cos(" + theta + ") is " + (myfuncs.sqroot(1-sum*sum)));
	}
}