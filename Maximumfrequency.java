import java.util.Arrays;
class Maximumfrequency{
static void maxFrequency(int arr[], int N, int K){
	Arrays.sort(arr);
	int start = 0, end = 0;
	int sum = 0, res = 0;
	for(end = 0; end < N; end++){
		sum += arr[end];
		while ((end - start + 1) * arr[end] - sum > K){
			sum -= arr[start];
			start++;
		}
		res = Math.max(res, end - start + 1);
	}
	System.out.println(res);
}
public static void main(String[] args){
	int arr[] = { 1, 4, 8, 13 };
	int N = 4;
	int K = 5;
	maxFrequency(arr, N, K);
}
}