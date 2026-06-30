#include<iostream>
#include<stack>
#include<vector>

using namespace std;

//valid parentheses
bool isValid(string s){
    stack<char> st;
    for(char c:s){
        if(c == '(' || c=='{' || c=='[') st.push(c);
        else{
            if(st.empty()) return false;
            char top = st.top(); st.pop();
            if(c == ')' && top != '(') return false;
            if(c == '}' && top != '{') return false;
            if(c == ']' && top != '[') return false;
        }
    }
    return st.empty();
}

//Monotonic stack - Next greater element
vector<int> nextGreater(vector<int>& nums){
    int n = nums.size();
    vector<int> res(n,-1);
    stack<int> st; //store indices
    for(int i=0; i<n; i++){
        while(!st.empty() && nums[st.top()] < nums[i]){
            res[st.top()] = nums[i]; //found next greater
            st.pop();
        }
        st.push(i); //push current index
    }
    return res;
}

int main(){

    stack<int> st;
    st.push(5);
    cout<<st.top()<<endl; //peek no removal
    st.pop();
    cout<<st.empty()<<endl;
    cout<<st.size()<<endl;


    return 0;
}
#include<iostream>
#include<stack>

using namespace std;

//valid parentheses
bool isValid(string s){
    stack<char> st;
    for(char c:s){
        if(c == '(' || c=='{' || c=='[') st.push(c);
        else{
            if(st.empty()) return false;
            char top = st.top(); st.pop();
            if(c == ')' && top != '(') return false;
            if(c == '}' && top != '{') return false;
            if(c == ']' && top != '[') return false;
        }
    }
    return st.empty();
}

int main(){

    stack<int> st;
    st.push(5);
    cout<<st.top()<<endl; //peek no removal
    st.pop();
    cout<<st.empty()<<endl;
    cout<<st.size()<<endl;


    return 0;
}