package uva;

public class Fibonacci {
	public static int fib(int n) {
		if(n <= 1)
			return n;
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(Fibonacci.fib(5));
	}

}
