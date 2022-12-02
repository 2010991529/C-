#include<iostream>
using namespace std;
int main(){
    int arr[3][3] = {{1,2,3},{4,5,6},{7,8,9}};
    char arr1[][3] = {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
    int arr[3][3];
    for (int i = 0; i < 3; i++){
        for(int j = 0;j < 3; j++){
            cin>>arr[i][j];
        }
    }
    for (int i = 0; i < 3; i++){
        for(int j = 0;j < 3; j++){
            cout<<arr1[j][i]<<"\t";
        }
        cout<<endl;
    }
     for (int i = 0; i < 3; i++){
        for(int j = 0;j < 3; j++){
            cout<<*(*(arr + i) + j)<<"\t";
        }
        cout<<endl;
    }
    
    return 0;
}