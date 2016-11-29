public class Calculator {
	public static double getsum(double a , double b) {
		return (a+b);
	}
	public static double getproduct(double a, double b) {
		return (a*b);
	}
	public static double getaverage(double a, double b) {
		return (a+b)/2.0;
	}
	public static double getsumotmn(double [] num) {
		double sum=0.0;
		for (int i=0;i<num.length; i++) {
			sum+=num[i];
		}
		return(sum);		
	}
	public static double getproductotmn(double [] num) {
		double product=1.0;
		for (int i=0;i<num.length; i++) {
			product*=num[i];
		}
		return (product);
	}
	public static double getaverageotmn(double [] num) {
		double average = 0.0;
		for (int i=0; i<num.length; i++) {
			average+=num[i];
		}
		return (average/num.length);
	}
}
