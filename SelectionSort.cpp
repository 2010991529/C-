#include<iostream>
using namespace std;
int main(){
    // Time Complexity : - n^2
    int n;
    cin>>n;
    int arr[n] ;
    for(int i = 0;i<n;i++){
        cin>>arr[i];
    }
    for(int i= 0;i<=n-2;i++){
        int min = i;
        for(int j= i;j<=n-1;j++){
            if(arr[j]<arr[min]){
                min = j;
            }
            }
            arr[i] = (arr[i] + arr[min]) - (arr[min] = arr[i]);
        }
    
    for(int i = 0;i<n;i++){
        cout<<arr[i] << " ";
    }
    return 0;
}