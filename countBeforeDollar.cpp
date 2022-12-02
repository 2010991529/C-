#include <iostream>
using namespace std;
int main(){
    string str;
    cin>>str;
    int i = 0;
    while(str.at(i) != '$'){
        i++;
    }
    cout<<i<<endl;
}