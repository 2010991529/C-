#include<iostream>
using namespace std;
void multiply(int arr[],int i,int &count){
    int carry = 0;
    for (int j = 0; j <= count; i++){
        int product = arr[j]*i+carry;
        arr[j] = product%10;
        carry = product/10;
    }
    while(carry!=0){
        count++;
        arr[count] = carry % 10;
        carry = carry/10;
    }
}
void factorial(int n){
    int arr[2000] = {1};
    int count = 0;
    for(int i=2;i<=n;i++){
        multiply(arr,i,count);
    }
    for (int i = count; i >=0; i--){
        cout<<arr[i];
    }cout<<endl;
    

}
int main(){
    int n;
    cin>>n;
    factorial(n);
    return 0;
}