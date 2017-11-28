import java.util.*;

public class Cjisuan {
	public static void main(String[] args) {

		Scanner out = new Scanner(System.in);
		System.out.println("输入m：");
		int h = out.nextInt();
		System.out.println("输入n：");
		int k = out.nextInt();
		//double sum = factorial(h);
		double sum = Cgongshi(h, k);
		System.out.println(sum);
		
	}

	static double factorial(int j) {

		long result = 1;
		
		System.out.println(j);
		for (int i = 1; i <= j; i++) {

			result = result * i;

		}
		System.out.println(result);
		return result;
		
	}

	public static double Cgongshi(int m, int n) {

		double c = factorial(n) / (factorial(m) * factorial(n - m));

		System.out.println(c);
		return c;
		
	}
}
