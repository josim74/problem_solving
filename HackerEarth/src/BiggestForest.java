import java.util.Scanner;

public class BiggestForest {
	public static char[][] f;
	public static int b;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int k = 0;
		 f = new char [n][n];
		 
		for(int i = 0; i<n; i++) {
			for(int j = 0; j <i; j++) {
				f[i][j] = sc.next().charAt(k++);
			}
		}
		System.out.println(getBiggestFOrest(n));

	}
	private static int getBiggestFOrest(int n) {
		int x = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				if(f[i][j] == 'T') {
					x++;
				}else {
					if(b<x) {
						b = x;
					}
					break;
				}
			}
		}
		return b;
	}

}
