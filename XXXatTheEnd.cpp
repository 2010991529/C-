#include<iostream>
#include<cstring>
using namespace std;
string atTheEnd(string s){
    string cc = s.substr(0,1);
	string cs = s.substr(1);
	if(s.length() == 0){
		return s;
	}
	if(cc == "X"){
		return atTheEnd(cs) + cc;
	}
	else{
		return cc + atTheEnd(cs);
	}
}
int main(){
	string str = "devXaXnXshXXXi";
	cout<<atTheEnd(str);
}