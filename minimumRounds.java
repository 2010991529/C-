import java.util.*;
class minimumRounds {
	static void findMinimumTime(
		String tasks, int K)
	{
		Map<Character, Integer> map = new HashMap<>();
		int curr_time = 0;
		for (char c : tasks.toCharArray()) {
			if (map.containsKey(c)) {
				if (curr_time - map.get(c) <= K) {
					curr_time += K - (curr_time - map.get(c)) + 1;
				}
			}
			map.put(c, curr_time);
			curr_time++;
		}
		System.out.println(curr_time);
	}
	public static void main(String[] args){
		String S = "ABACCA";
		int K = 2;
		findMinimumTime(S, K);
	}
}