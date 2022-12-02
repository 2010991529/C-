#include<iostream>
using namespace std;
int main(){
    int p;
    double t;
    cin>>p>>t;
    double SI;
    if(p<=10000){
        SI =(p*10*t)/100;
    }
    else{
        SI =(p*15*t)/100;
    }
    cout<<SI<<endl;    
    return 0;
}