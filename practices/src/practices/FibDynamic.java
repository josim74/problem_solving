package practices;

import java.util.Scanner;

public class FibDynamic {
	public static int[] a;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a = new int[n+1];
		for(int i = 0; i<= n; i++) {
			System.out.print(fib(i));
		}
	}
	private static int fib(int n) {
		if(n == 0) {
			return 0;
		}else if(n == 1 || n == 2) {
			return 1;
		}else if(a[n] != 0) {
			return a[n];
		}else {
			a[n] = fib(n - 1)+fib(n - 2);
		}
		return a[n];
	}
}
