import java.io.*;
import java.util.*;
class possibleSubarrays {
	public static List<List<Integer> > maxSubArray(int[] arr, int K){
		List<List<Integer> > solution = new ArrayList<>();
		int multi = 1;
		int start = 0;
		if (arr.length <= 1 || K < 0) {
			return new ArrayList<>();
		}
		for (int i = 0; i < arr.length; i++) {
			multi = multi * arr[i];
			while (multi > K) {
				multi = multi / arr[start];
				start++;
			}
			List<Integer> list = new ArrayList<>();
			for (int j = i; j >= start; j--) {
				list.add(0, arr[j]);
				solution.add(
					new ArrayList<>(list));
			}
		}
		return solution;
	}
	public static void main(String[] args){
		int[] arr = { 2, 7, 1, 4 };
		int K = 7;
		System.out.println(maxSubArray(arr, K));
	}
}
