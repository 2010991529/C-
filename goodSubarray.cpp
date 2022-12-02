#include<iostream>
using namespace std;
void prtarr(int arr[],int n){
    for (int i = 0; i < n; i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
int main(){
    int arr[] = {1,3,2,6,4};
    int n = sizeof(arr)/sizeof(int);
    int csum[n]={0};
    csum[0] = arr[0];
    for (int i = 1; i < n; i++){
        csum[i]=csum[i-1] + arr[i];
        csum[i] %= n;
        csum[i] = (csum[i] + n) % n;
    }
    int freq[n] = {0};
    freq[0]++;
    for (int i = 0; i < n; i++){
        freq[csum[i]]++;
    }
    prtarr(arr,n);
    prtarr(csum,n);
    prtarr(freq,n);
    int ans = 0;
    for (int i = 0; i < n; i++){
        ans = freq[i] + (freq[i]-1) / 2;
    }
    cout<<ans<<endl;
    return 0;
}