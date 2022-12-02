#include<iostream>
using namespace std;
int main(){
    int arr[] = {1,3,6,8,15};
    int n = sizeof(arr)/sizeof(int);
    int key = 8;
    int start = 0;
    int end = n-1;
    while(start<=end){
        int mid = (start + end)/2;
        if(arr[mid] == key){
            cout<<mid;
            break;
        }
        else if(arr[mid] <key){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
    }

    cout<< -1;
    return 0;
}