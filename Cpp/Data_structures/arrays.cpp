#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main(){
    //static array
    int arr[5]={1,2,3,4,5};

    //dynamic array
    vector<int> v={1,2,3,4};
    v.push_back(5); //O(1)
    v.pop_back(); //O(1) 
    v[2]; //O(1) access
    cout<<v.size(); //no. of elements
    sort(v.begin(),v.end()); //O(n log n)

    //Two pointer pattern (sorted array)
    int l=0,r=v.size()-1, target = 4;
    while(l<r){
        if(v[l] + v[r] == target) break; //if found break
        else if (v[l] + v[r] < target) l++;
        else r--;
    }

    // //Prefix sum (range sum in O(1))
    // vector<int> prefix(n+1,0)


    return 0;
}