#include <iostream>
#include <vector>
#include <queue>
#include <stack>
#include "../../utils/visualizer.h"

// Graph represented as an Adjacency List
// graph[0] = {1, 2} means Node 0 is connected to 1 and 2
using Graph = std::vector<std::vector<int>>;

void bfsVisualized(const Graph& graph, int startNode) {
    Visualizer::clearScreen();
    std::cout << "Starting BFS (Layer by Layer) from Node " << startNode << "...\n";
    Visualizer::sleep(1000);

    std::vector<bool> visited(graph.size(), false);
    std::queue<int> q;

    visited[startNode] = true;
    q.push(startNode);

    while (!q.empty()) {
        int node = q.front();
        q.pop();

        Visualizer::clearScreen();
        std::cout << "BFS Visiting Node: " << node << "\n\n";
        Visualizer::drawVector(visited, node, "Visited Status (1=True)");
        Visualizer::sleep(800);

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                q.push(neighbor);
                std::cout << "-> Adding neighbor " << neighbor << " to queue.\n";
                Visualizer::sleep(300);
            }
        }
    }
}

void dfsVisualized(const Graph& graph, int startNode) {
    Visualizer::clearScreen();
    std::cout << "Starting DFS (Deep Dive) from Node " << startNode << "...\n";
    Visualizer::sleep(1000);

    std::vector<bool> visited(graph.size(), false);
    std::stack<int> s;

    s.push(startNode);

    while (!s.empty()) {
        int node = s.top();
        s.pop();

        if (!visited[node]) {
            visited[node] = true;
            Visualizer::clearScreen();
            std::cout << "DFS Visiting Node: " << node << "\n\n";
            Visualizer::drawVector(visited, node, "Visited Status");
            Visualizer::sleep(800);

            // Add neighbors to stack (reverse order to maintain natural order if helpful)
            for (auto it = graph[node].rbegin(); it != graph[node].rend(); ++it) {
                if (!visited[*it]) {
                    s.push(*it);
                }
            }
        }
    }
}

int main() {
    // 0 -- 1
    // |    |
    // 2 -- 3 -- 4
    Graph graph(5);
    graph[0] = {1, 2};
    graph[1] = {0, 3};
    graph[2] = {0, 3};
    graph[3] = {1, 2, 4};
    graph[4] = {3};

    bfsVisualized(graph, 0);
    
    Visualizer::sleep(1000);
    
    dfsVisualized(graph, 0);

    return 0;
}
