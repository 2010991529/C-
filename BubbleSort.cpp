#include<iostream>
using namespace std;
int main(){
    // Time Complexity : - n^2
    int n;
    int temp = 0;
    cin>>n;
    int arr[n] ;
    for(int i = 0;i<n;i++){
        cin>>arr[i];
    }
    for(int i= 0;i<=n-2;i++){
        for(int j= 0;j<=n-2-i;j++){
            if(arr[j]>arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
// 2nd way to sort without using extra variable
                // arr[j]= arr[j] + arr[j+1];//10 //15
                // arr[j+1] = arr[j] - arr[j+1];
                // arr[j] = arr[j] - arr[j+1];
//3rd way to sort in one line only
                //arr[j+1] = (arr[j] + arr[j+1]) - (arr[j] = arr[j+1]);
            }
        }
    }
    for(int i = 0;i<n;i++){
        cout<<arr[i] << " ";
    }
    return 0;
}