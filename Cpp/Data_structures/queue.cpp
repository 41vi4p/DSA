#include<iostream>
#include<queue>

using namespace std;

// BFS template (graph/tree)
void bfs(int start, vector<vector<int>>& adj){
    vector<bool> visited(adj.size(),false);
    queue<int> q;
    q.push(start);
    visited[start] = true;
    while (!q.empty())
    {
        int node = q.front(); q.pop();

        for(int nd:adj[node]){
            if(!visited[nd]){
                visited[nd] =true;
                q.push(nd);
            }
        }
    }
    
}

int main(){
    queue<int> q;
    // q.push(1); //enqueue
    // q.front(); //peek front
    // q.back(); //peek back
    // q.pop(); //dequeue 
    // q.empty();

    

    return 0;
}