import java.io.*;
import java.util.*;
class MinNoOfArrowsToBurstBalloons {
	public static int minArrows(int points[][]){
		Arrays.sort(points,(a, b) -> Integer.compare(a[1], b[1]));
		int end = points[0][1];
		int arrow = 1;
		for (int i = 1; i < points.length; i++) {
			if (points[i][0] <= end) {
				continue;
			}		
			else {
				end = points[i][1];
				arrow++;
			}
		}
		return arrow;
	}
	public static void main(String[] args){
		int[][] points = { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } };
		System.out.println(minArrows(points));
	}
}