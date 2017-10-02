import java.util.Scanner;


public class stdevnoarray{
	public static void main(String[] args){


		double variance = 0;
		double stdev = 0;
		double sum = 0;
		double i;

		Scanner note = new Scanner(System.in);
		System.out.println("How many times to test?");
		int times = note.nextInt();

		for (int count=0; count < times; count++){
			i = Math.random();
			variance = variance + i*i/(double)times;
			sum = sum + i;
		}

		variance = variance - (sum/times)*(sum/times);

		stdev = myfuncs.sqroot(variance);

		System.out.println(stdev);
	}
}