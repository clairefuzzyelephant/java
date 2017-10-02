import java.util.Scanner;

public class stdev{
	public static void main(String[] args){

		Scanner note = new Scanner(System.in);
		System.out.println("How many times you test? ");
		int n = note.nextInt();

		double[] q = new double[n];

		double stdev = 0;
		for (int i=0; i < n; i++){
			q[i] = Math.random();

		}
		double sum = 0;

		for (int i = 0; i < n; i++){
			sum +=q[i];
		}
		double mean = sum/n;

		for (int i= 0; i< n; i++){
			stdev = stdev + (q[i]-mean)*(q[i]-mean);
		}
		stdev = myfuncs.sqroot(stdev)/(n-1);

		System.out.println(stdev);
	}
}