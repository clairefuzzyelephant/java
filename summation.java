import java.util.Scanner;

public class summation{
	public static void main(String[] args){
		double k = 100;
		double j = 2;
		double sum = 0;
		while (j <= k){
			sum = sum + (-1.0)/j;
			j = j + 2;
		} 
		j = j - 101;
		while (j <= k){
			sum = sum + 1.0/j;
			j = j + 2;
		}
		System.out.println(sum);
	}
}

/* simpler way:
double sign = -1.0
sign = -sign
flip the signs each time

*/ 