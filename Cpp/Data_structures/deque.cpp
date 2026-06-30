#include<iostream>
#include<deque>
#include<vector>

using namespace std;

//sliding window maximum (k-size window)
vector<int> maxSlidingWindow(vector<int>& nums, int k){
    deque<int> dq; //stores indices (decreasing values)
    vector<int> res;
    for(int i=0; i<nums.size();i++){
        //remove out-of-window indices
        if(!dq.empty() && dq.front() <= i-k) dq.pop_front();
        //maintain decreasing order
        while(!dq.empty() && nums[dq.back()] < nums[i]) dq.pop_back();
        dq.push_back(i);
        if(i >= k-1) res.push_back(nums[dq.front()]);
    }
    return res;
}

int main(){


    return 0;
}