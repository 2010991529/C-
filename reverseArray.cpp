#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    int arr[n];
    int temp = 0;
    for (int i = 0; i < n; i++){
        cin>>arr[i];
    }
    for (int i = 0; i < n/2; i++){
        temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
    }
    for (int i = 0; i < n; i++){
        cout<<arr[i]<<endl;
    }
    return 0;
}