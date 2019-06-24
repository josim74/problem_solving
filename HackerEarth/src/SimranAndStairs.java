import java.util.Scanner;

public class SimranAndStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getPossibleWays(n));
		sc.close();
	}

	private static int getPossibleWays(int n) {
		if(n == 0) {
			return 1;
		}else if(n == 1) {
			return 1;
		}else if(n == 2) {
			return 2;
		}
		return getPossibleWays(n-3)+getPossibleWays(n-2)+getPossibleWays(n-1);
	}

}
