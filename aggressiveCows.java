import java.util.*;

public class aggressiveCows {
    public static void main(String[] args){
		int K = 3;
		int[] arr = { 1, 2, 4, 8, 9 };
		int N = arr.length;
		System.out.println(aggressive_cows(arr, N, K));
	}
	public static boolean ok(int[] v, int x, int c){
		int n = v.length;
		int count = 1;
		int d = v[0];
		for (int i = 1; i < n; i++) {
			if (v[i] - d >= x) {
				d = v[i];
				count++;
			}
			else {
				continue;
			}
		}
		if (count >= c) {
			return true;
		}
		return false;
	}
	public static int aggressive_cows(int[] v, int n, int k){
		long ans = -1;
		int maxi = 0;
		for (int i = 0; i < n; i++) {
			maxi = Math.max(maxi, v[i]);
		}
		for (long i = 1; i <= maxi; i++) {
			if (ok(v, (int)i, k)) {
				ans = i;
			}
			else
				break;
		}
		return (int)ans;
	}
}