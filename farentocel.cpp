#include<iostream>
using namespace std;
void celtofaren(){
    float C = 0.0f;
    for(int i= 0;i<=300;i=i+20){
        cout<<i<<" ";
        C = 5*(i-32)/9;
        cout<<C<<endl;
}
}
int main(){
    celtofaren();
}