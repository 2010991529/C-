import java.util.*;
public class primefactors{
    public static void main(String args[]){
        int n= 42;
        for(int i=0;i<n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}