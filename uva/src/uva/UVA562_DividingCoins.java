package uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVA562_DividingCoins {
	
	public static class InputReader{
		private BufferedReader reader;
		private StringTokenizer tokenizer;
		
		
		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}
		
		public String next() {
			while(tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return tokenizer.nextToken();
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputReader in = new InputReader(System.in);
		int T = in.nextInt();
		
		
		while(T-- != 0) {
			int N = in.nextInt();
			int[] A = new int[N];
			int sum = 0;
			for(int n = 0; n < N; n++) {
				A[n] = in.nextInt();
				sum+= A[n];
			}
			
			
			int column = 0;
			boolean[][] B = new boolean[sum / 2 + 1][N+1];
			for(int i = 0; i < N +1; i++) {
				B[0][i] = true;
			}
			
			
			for(int i = 0; i < A.length; i++) {
				for(int j = 0; j <= sum / 2; j++) {
					if(B[j][i]) {
						B[j][i+1] = true;
						if((j+A[i]) <= sum / 2) {
							B[j + A[i]][i+1] = true;
						}
					}
				}
			}
			
			
			int count = 0;
			for(int i = sum / 2; i >= 0; i--) {
				if(B[i][A.length]) break;
				count++;
			}
			System.out.println();
			System.out.println((sum % 2 == 0 ) ? 2 * count : 2 * count +1);
		}
	}

}
