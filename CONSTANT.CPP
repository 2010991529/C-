#include<iostream>
using namespace std;
int main(){
    const int i=9;
    if(i>0){
        cout<<i<<endl;
       // i = 10; Cannot change value of i coz its a constant variable
       int i =10;
       cout<<i<<endl;
    } 
    return 0;
}