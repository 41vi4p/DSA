// Program to print table of a given number
#include<iostream>

using namespace std;

int main(){
    int n,i,e=15;
    cout<<"Enter a number to print its table: ";
    cin>>n;
    cout<<"Table of "<<n<<" is as follows: "<<endl;
    for(i=1; i<=e; i++){
        cout<<n<<" x "<<i<<" = "<<n*i<<endl;
    }
    return 0;
}