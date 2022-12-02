#include<iostream>
using namespace std;
int main(){
    int n,a;
    cin>>n;
    int max = INT16_MIN;
    for (int i = 0; i < n; i++){
        cin>>a;
        if (a>max){
            max = a;
        }     
    }
   
    cout<<max<<endl;

    return 0;
}