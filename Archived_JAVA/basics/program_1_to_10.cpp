#include<iostream>

using namespace std;

void p1(int n){
// * * * 
// * * * 
// * * * 
// * * * 
// * * *
    for(int i=1;i<=n;i++){
        for(int j=1; j<=3;j++)
            cout<<"* ";
        cout<<endl;
    }
}

void p2(int n){ 
// 1 1 1 
// 1 1 1 
// 1 1 1 
// 1 1 1 
// 1 1 1 
    for(int i=1;i<=n;i++){
        for(int j=1; j<=3;j++)
            cout<<1<<" ";
        cout<<endl;
    }
}

void p3(int n){
// 1 1 1 
// 2 2 2 
// 3 3 3 
// 4 4 4 
// 5 5 5
    for(int i=1;i<=n;i++){
        for(int j=1; j<=3;j++)
            cout<<i<<" ";
        cout<<endl;
    }
}

void p4(int n)
{
// 1 2 3 
// 4 5 6 
// 7 8 9 
    int k=1;
    for(int i=1;i<=n;i++){
        for(int j=1; j<=3;j++)
        {
            cout<<k<<" ";
            k++;
        }
        cout<<endl;
    }
}

void p5(int n){
// 1 2 3 
// 1 2 3 
// 1 2 3 
    for(int i=1;i<=n;i++){
        for(int j=1; j<=3;j++)
            cout<<j<<" ";
        cout<<endl;
    }
}

void p6(int n){
// 3 3 3 
// 2 2 2 
// 1 1 1  
    for(int i=3;i>=1;i--){
        for(int j=1; j<=3;j++)
            cout<<i<<" ";
        cout<<endl;
    }
}

void p7(int n){
// A A A 
// B B B 
// C C C 
    char A='A';
    for(int i=1;i<=3;i++){
        for(int j=1; j<=3;j++)
            cout<<A<<" ";
        A=A+1;
        cout<<endl;
    }
}

void p8(){
// A B C 
// A B C 
// A B C 
    char A='A';
    for(int i=1;i<=3;i++){
        for(int j=1; j<=3;j++)
        {
            cout<<A<<" ";
            A=A+1;
        }
        A='A';
        
        cout<<endl;
    }
}

void p9(){
// A B C 
// D E F 
// G H I
    char A='A';
    for(int i=1;i<=3;i++){
        for(int j=1; j<=3;j++)
        {
            cout<<A<<" ";
            A=A+1;
        }
        
        cout<<endl;
    }
}

void p10(){
// C C C 
// B B B 
// A A A
    char A='C';
    for(int i=3;i>=1;i--){
        for(int j=1; j<=3;j++)
        {
            cout<<A<<" ";
        }
        A=A-1;
        cout<<endl;
    }
}

