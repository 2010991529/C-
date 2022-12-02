#include<iostream>
using namespace std;
int main(){
    int n,a;
    cin>>n;
    int min = INT16_MAX;
    for (int i = 0; i < n; i++){
        cin>>a;
        if (a<min){
            min = a;
        }     
    }
   
    cout<<min<<endl;

    return 0;
}