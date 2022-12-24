import java.util.Arrays;
class DominiAndTromino{
public static long MOD = 1000000007l;
public static long numTilings(int N){
	if (N < 3){
		return N;
	}
	long[][] dp = new long[N + 1][3];
	for(long[] row : dp){
		Arrays.fill(row, 0);
	}
	dp[0][0] = dp[1][0] = 1;
	dp[1][1] = dp[1][2] = 1;
	for(int i = 2; i <= N; i++){
		dp[i][0] = (dp[i - 1][0] + dp[i - 2][0] + dp[i - 2][1] + dp[i - 2][2]) % MOD;		
    	dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % MOD;
		dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
	}
	return dp[N][0];
}
public static void main(String args[]){
	int N = 3;
	System.out.println(numTilings(N));
}
}