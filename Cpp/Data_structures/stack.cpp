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