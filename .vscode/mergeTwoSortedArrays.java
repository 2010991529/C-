//import java.util.*;

public class mergeTwoSortedArrays {

    public static int[] merge(int[] arr1,int[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        int[] arr3 = new int[m+n];
        int x = 0;
        int y = 0;
        for(int i=0;i<m+n;i++){
           
            if(x<m && y<n){
                if(arr1[x]<=arr2[y] ){
                    arr3[i]=arr1[x];
                    x++;

                }
                else{
                    arr3[i]=arr2[y];
                    y++;
                }
        }
        else if(x<m){
            arr3[i]=arr1[x];
            x++;
        }
        else{
            arr3[i]=arr2[y];
            y++;
        }
        }
        return arr3;
    }
    public static void main(String args[]){
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8};

        //int arr3[];
        int[] arr3 =merge(arr1,arr2);
       for(int i=0;i<arr3.length;i++){
        //output
        System.out.print(arr3[i] + " ");
       }
    }
}
