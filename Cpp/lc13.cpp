//Leetcode 13: Roman to integer 

#include<iostream>
#include<vector>
#include<unordered_map>
using namespace std;

int detectNumber(char ch){ 
        static unordered_map<char,int> rmn_db={{'I',1},{'V',5},{'X',10},{'L',50},{'C',100},{'D',500},{'M',1000}};
        int num=rmn_db[ch];
    return num;
}

int main(){
    string s="MCMXCIV";

    vector<int> extracted;
        int i=0,final_num=0;
        
        for(char ch:s)
            extracted.push_back(detectNumber(ch));
    
        final_num=0;
        for(i=0;i<extracted.size();i++){
            if(i+1<extracted.size() && extracted[i]<extracted[i+1])
                final_num -= extracted[i];
            else    
                final_num += extracted[i];
        }
                
    cout<<final_num<<endl;

    return 0;
}


// //Optimal SOlution:
// int final_num=0;
        
//         for(int i=0;i<s.size();i++){
//             int curr= detectNumber(s[i]);
//             int next=(i+1<s.size())?detectNumber(s[i+1]):0;

//             if(curr<next)
//                 final_num -= curr;
//             else    
//                 final_num += curr;
//         }

//         return final_num;
