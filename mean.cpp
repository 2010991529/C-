#include <iostream>
using namespace std;
int main(){
   int a,sum=0,n;
   cin>>n;
   for(int i=0;i<n;i++){
       cin>>a;
       sum = sum + a;
   } 
   int mean=0;
   mean=sum/n;
}