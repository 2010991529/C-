import java.io.*;
class HouseRobber{
static int maxLoot(int hval[], int n){
	if (n < 0) {
	return 0;
	}
	if (n == 0) {
	return hval[0];
	}
	int pick = hval[n] + maxLoot(hval, n - 2);
	int notPick = maxLoot(hval, n - 1);
	return Math.max(pick, notPick);
}
public static void main(String[] args){
	int hval[] = { 6, 7, 1, 3, 8, 2, 4 };
	int n = hval.length;
	System.out.println("Maximum loot possible : " + maxLoot(hval, n-1));
}
}