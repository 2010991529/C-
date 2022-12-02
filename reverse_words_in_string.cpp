#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main(){
    string s;
    getline(cin,s);
    vector<string> temp;
    string str = "";
    for (int i = 0; i < s.length(); i++){
        if(s[i] == ' '){
            temp.push_back(str);
            str = "";
        }
        else{
            str += s[i];
        }
    }
    temp.push_back(str);

    for (int i = temp.size() - 1; i >0; i--){
        cout<<temp[i] << " ";
    }
    cout<<temp[0]<<endl;
    
    
    return 0;
}