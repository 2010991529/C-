import java.util.*;

public class binarySearch {
    public static void main(String args[]){
        //Scanner s = new Scanner(System.in);
        int[] arr = {2,7,8,12,45,67,89,90};
        int n = arr.length;
        int mid = n/2;
        int start = 0;
        int end = n-1;
        int x = 89;
        while(start<end){
            if(x==arr[mid]){
                System.out.println(mid);
                return ;
            }
            else if(x>arr[mid]){
                start = mid+1;
                mid = (start + end)/2;
            }
            else{
                end = mid-1;
                mid = (start+end)/2;
            }
        }
        System.out.println(-1);
    }    
}
