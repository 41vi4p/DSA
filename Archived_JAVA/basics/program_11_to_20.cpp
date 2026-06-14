#include<iostream>

using namespace std;

void p11(){
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1; j<=i;j++)
            cout<<"* ";
        cout<<endl;
    }
}

void p12(){ 
// *****
// ****
// ***
// **
// * 
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=5; j>=i;j--)
            cout<<"*";
        cout<<endl;
    }
}

void p13(){
// *
// **
// ***
// ****
// *****
// *****
// ****
// ***
// **
// *
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1; j<=i;j++)
            cout<<"*";
        cout<<endl;
    }
    n-1;
    for(int i=1;i<=n;i++){
        for(int j=5; j>=i;j--)
            cout<<"*";
        cout<<endl;
    }
}

void p14()
{
//     *
//    **
//   ***
//  ****
// *****
    int n=5;
    int l=n;
    for(int i=1;i<=n;i++){
        for(int k=l-1; k>=1;k--)
                cout<<" ";
        l--;
        for(int j=1; j<=i;j++)
        {
            
            cout<<"*";
        }
        
        cout<<endl;
    }
}

void p15(){
// *****
//  ****
//   ***
//    **
//     * 
    int n=5;
    int l=1,c=5;
    for(int i=1;i<=n;i++){
        for(int k=c; k>=1;k--)
                cout<<"*";
        cout<<endl;
        for(int j=l; j>=1;j--)
        {
            
            cout<<" ";
        }
        c--;
        l++;
        // cout<<endl;
    }
}

void p16(){
//      *
//     ***
//    *****
//   *******
//  *********  
    int n=5;
    int l=n-1;
    for(int i=1;i<=n;i++){
        for(int k=l;k>=i-1;k--)
        {
            cout<<" ";
        }
        for(int j=1; j<=2*i-1;j++)
        { 
            cout<<"*";
        }
        
        cout<<endl;
    }
}

void p17(){
// *****
//  ***
//   * 
    int n=4;
    int l=1;
    for(int i=1;i<=n;i++){
        for(int k=1;k<=i-1;k++)
        {
            cout<<" ";
        }
        for(int j=1; j<=2*(n-i)+1;j++)
        { 
            cout<<"*";
        }
        
        cout<<endl;
        
    }
}

void p18(){
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *
    int n=4;
    int l=n-1;
    for(int i=1;i<=n;i++){
        for(int k=l;k>=i-1;k--)
        {
            cout<<" ";
        }
        for(int j=1; j<=2*i-1;j++)
        { 
            cout<<"*";
        }
        
        cout<<endl;
    }
    n=5;
    l=1;
    for(int i=1;i<=n;i++){
        for(int k=1;k<=i-1;k++)
        {
            cout<<" ";
        }
        for(int j=1; j<=2*(n-i)+1;j++)
        { 
            cout<<"*";
        }
        
        cout<<endl;
        
    }
}

void p19(){
// * * * * * 
// *       * 
// *       * 
// *       * 
// * * * * * 
    int n=5;
    for(int i=1; i<=n;i++)
    {
        if(i==1 || i==5){
            for(int j=1;j<=n;j++){
                cout<<"* ";
            }
        }
        else {
                cout<<"* ";
                for(int j=1;j<=n-2;j++){
                    cout<<"  ";
                }
                cout<<"* ";
            }
        
        cout<<endl;
    }    
}

void p20(){
//     *
//     *
// * * * * * 
//     *
//     *
    int n=5;
    int f=(n+1)/2;
    int k;
    for(int i=1;i<=n;i++)
    {
        if(i==f){
            for(int j=1;j<=n;j++){
                cout<<"* ";
            }
        }
        else
        {
            k=f;
            for(int j=1;j<=k;j++){
                cout<<" ";
            }
            cout<<" *";
        }
        cout<<endl;
    }
}

void p21(){
//  *     *
//   *   *
//     *
//   *   *
//  *     *
    int n=5;
    for(int i=1;i<=n;i++){
        if(i==5 || i==1){
            cout<<" *";
            for(int j=1;j<=n-1;j++){
                cout<<" ";
            }
            cout<<" *";

        }
        else if(i==2||i==4){
            for(int j=1;j<=n-4;j++){
                cout<<" ";
            }
            cout<<" *";
            for(int j=1;j<=n-3;j++){
                cout<<" ";
            }
            cout<<" *";
        }
        else if(i==3){
            for(int j=1;j<=n-4;j++){
                cout<<" ";
            }
            
            for(int j=1;j<=n-3;j++){
                cout<<" ";
            }
            cout<<" *";
        }
        cout<<endl;
    }
}

// int main(){
//     int i,n=3;
//     cout<<endl;
//     p20();
//     return 0;
// }