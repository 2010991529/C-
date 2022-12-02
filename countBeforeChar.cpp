#include<iostream>
using namespace std;
int main(){
    char ch;
    cin>>ch;
    int count = 0;
    while (ch!='$')
    {
        count++;
        cin>>ch;
    }
    cout<<count<<endl;
    return 0;
    
}