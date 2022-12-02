#include<iostream>
#include<cmath>
using namespace std;
int main(){
    int n = 100;
    int k = 2;
    if(k==1){
        cout<<n<<endl;
    }
    else{
        //linear Search:-------------------
    //     for (int i = 2; i < n; i++){
    //         if(pow(i,k) > n){
    //             cout<<i-1<<endl;
    //             break;
    //         }
    //     }
    // }
        // Binary Search:-------------------
        int s = 2;
        int e = sqrt(n);
        while(s<=e){
            int m = (s+e)/2;
            int prod = pow(m,k);
            if(prod == n){
                cout<<m<<endl;
                break;
            }
            else if(prod<n){
                s = m+1;
            }
            else{
                e = m-1;
            }
        }
    }
    return 0;
}