#include<iostream>
using namespace std;
int main(){
    char n;
    cin>>n;
    // if(n>=65 && n<=90){
    //     cout<<"uppercase";
    // }
    // else if (n>='a' && n<='z'){
    //     cout<<"Lowercase";
    // }
    // else{
    //     cout<<"Other Characters";
    // }
    if(islower(n)){
        cout<<"Lowercase";
    }
    else if (isupper(n)){
        cout<<"Upperrcase";
    }
    else{
        cout<<"Other Characters";
    }
    
    
    return 0;
}