#include<iostream>
using namespace std;
int main(){
    int n,a;
    cin>>n;
    float mean;
    float Sum = 0.0;
    for (int i = 0; i < n; i++){
        cin>>a;
        Sum = Sum + a;
    }
    mean = Sum/n;
    cout<<mean<<endl;

    return 0;
}