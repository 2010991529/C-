#include<iostream>
using namespace std;
int main(){
    string s;
    char arr[100];
    // cin>>s;
    getline(cin,s);
    // int n = s.size();
    int n = s.length();
    cout<<s;
    cout<<endl;
    cout<<n; 
    return 0;
}
