public class myfuncs{


//SQUARE ROOT WITH 3 INPUT

	public static double sqroot(double w, double epsilon, double initg){

		double testnum = initg;
		double q = epsilon;
		double target = w;

		if (testnum*testnum > w){
			while (testnum* testnum > w){
				testnum -= 1;
			}
			for (testnum = testnum; testnum>0;testnum += q){
				if (testnum*testnum > w-q){
					break;
				}
			}
		}
		else if (testnum*testnum < w){
			while (testnum * testnum < w){
				testnum += 1;
			}
			for (testnum = testnum; testnum>0; testnum -= q){
				if (testnum*testnum < w+q){
					break;
				}
			}
		}
		return(testnum);
}




//SQUARE ROOT WITH TWO INPUT

	public static double sqroot(double w, double epsilon){

		double testnum = w/1.5;
		double q = epsilon;

		while (testnum*testnum < w-q || testnum*testnum > w+q){

			testnum = 0.5*(testnum + w/testnum);
		}

	return(testnum);
}




//SQUARE ROOT WITH ONE INPUT
	public static double sqroot(double w){

		double testnum = w/1.5;
		double q = 0.0001;

		while (testnum*testnum < w-q || testnum * testnum > w + q){

			testnum = 0.5 * (testnum + w/testnum);
		}
		return(testnum);
	}




//FACTORIAL
	public static int factorial(int n){

		int value = 1;

		for (int q = 1; q <= n; q += 1){
			value = value * q;
		}
		return(value);
	}




//SIN 
	public static double sin(double n){

		double theta = n;

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
		return(sum);
}
		
//COS
	public static double cos(double n){

			double theta = n;
			double costheta = myfuncs.sqroot(1-(myfuncs.sin(n))*(myfuncs.sin(n)));

			return(costheta);

		}


//TAN
	public static double tan(double n){

		double theta = n;
		double tantheta = myfuncs.sin(n)/myfuncs.cos(n);

		return(tantheta);

	}

	

//SHUFFLE AN ARRAY
	public static void shuffle(int[] z){

		int l = z.length - 1;
		int last;
		int index;

		for (int i = l; i >= 0; i--){
			last = z[i];
			index = (int)(Math.random()*z.length);

			z[i] = z[index];
			z[index] = last;

		}
	}




//MULTIPLY TWO MATRICES
	public static double[][] matrixmultiply(double[][] x, double[][] y, int m, int n, int p){

		//double[][] x = new double[m][n];
		//double[][] y = new double[n][p];

		double[][] z = new double[m][p]; //the resultant matrix

		int j = 0;
		int i = 0;
		z[i][j] = 0;

		for (int k = 0; k < n; k++){

			for (j = 0; j < p; j++){

				for (i = 0; i < m; i++){

					z[i][j] = z[i][j] + x[i][k] * y[k][j];
				}
			}

		}

		return z; //remember that z is not a primitive, returns location instead of values.
	}
}
