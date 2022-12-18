import java.util.*;
import java.lang.*;
class dailyTemperatures{
static void dailyTemperatures(int[] T){
	int n = T.length;
	int[] daysOfWait = new int[n];
	Arrays.fill(daysOfWait, -1);
	Stack<Integer> s = new Stack<>();
	for(int i = 0; i < n; i++){
		while (!s.isEmpty() && T[s.peek()] < T[i]){
			daysOfWait[s.peek()] = i - s.peek();
			s.pop();
		}
		s.push(i);
	}
	for(int i = 0; i < n; i++){
		System.out.print(daysOfWait[i] + " ");
	}
}
public static void main (String[] args){
	int[] arr = { 73, 74, 75, 71,69, 72, 76, 73 };
	dailyTemperatures(arr);
}
}