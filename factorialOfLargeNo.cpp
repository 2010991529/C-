#include<iostream>
using namespace std;
int main(){
    int n;
    int num;
    cin>>n;
    int arr[3*n];
    arr[0] = 1;
    for (int i = 1; i <3*n; i++){
        arr[i] = 0;
    }
    for (int i = 2; i <= n; i++){
        int carry = 0;
        for (int j = 0; j < 3*n; j++){
            num = arr[j]*i + carry;
            arr[j]= num%10;
            carry = num/10;
        } 
    }
    int count = 0;
    for (int i = 3*n-1; i >=0; i--){
        while(arr[i] == 0){
            count++;
            i--;
        }
            break;
    }
    for (int i = 3*n-1-count; i >=0; i--){  
        cout<<arr[i];
    } 
    return 0;
}