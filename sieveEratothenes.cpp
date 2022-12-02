#include<iostream>
using namespace std;
int main(){
    int n,n1,n2;
    n = 100;
    n1 = 10;
    n2 = 85;
    int arr[n+1] = {0};
    arr[2] = 1;
    for (int i = 3; i <=n; i+=2){
        arr[i] = 1;
    }
    for (int i = 3; i*i <= n; i+=2){
        if(arr[i] = 1){
        for(int j = i*i;j<=n;j+=i*2){
            arr[j] = 0;
        }
        }
    }
    for (int i = n1; i <=n2; i++){  
        if(arr[i] == 1){
            cout<<i<<" ";
        }
    }
    
    
    return 0;
}