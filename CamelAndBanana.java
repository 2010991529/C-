public class CamelAndBanana {
	final static int dp[][] = new int[1001][3001];
	static int recBananaCnt(int A, int B, int C){
		if (B <= A) {
			return 0;
		}
		if (B <= C) {
			return B - A;
		}
		if (A == 0) {
			return B;
		}
		if (dp[A][B] != -1) {
			return dp[A][B];
		}
		int maxCount = Integer.MIN_VALUE;
		int tripCount = B % C == 0 ? ((2 * B) / C) - 1 : ((2 * B) / C) + 1;
		for (int i = 1; i <= A; i++) {
			int curCount= recBananaCnt(A - i,B - tripCount * i, C);
			if (curCount > maxCount) {
				maxCount = curCount;
				dp[A][B] = maxCount;
			}
		}
		return maxCount;
	}
	static int maxBananaCnt(int A, int B, int C){
		for(int i = 0; i < 1001; i++)
			for (int j = 0; j < 3001; j++)
				dp[i][j] = -1;
		return recBananaCnt(A, B, C);
	}
	public static void main (String[] args) {
			int A = 1000;
			int B = 3000;
			int C = 1000;
			System.out.println(maxBananaCnt(A, B, C));
	}
}