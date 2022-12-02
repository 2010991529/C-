#include<iostream>
using namespace std;
int main(){
    int arr[] = {3,1,4,0,8,0,10,11};
    int count = 0;
    for (int i = 0; i < 8; i++){
        if(arr[i]==0){
            count++;
        }
    }
    for (int i = 0; i < 8; i++){
        int j = i;
        while (arr[j]==0){
            j++;
        }
        if(arr[i] == 0){
            arr[j] = (arr[j]+arr[i]) - (arr[i] = arr[j]);  //swap
        }    
    }
    
    for (int i = 0; i < 8; i++){
        cout<<arr[i]<<" ";
    }
    // for (int i = 8-count; i < 8; i++)
    // {
    //     cout<<"0"<<" ";
    // }
    
    return 0;
}