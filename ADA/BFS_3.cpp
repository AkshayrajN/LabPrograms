#include<bits/stdc++.h>
using namespace std;

void bfs(vector<int>adj[],int vis[],int start){
int node=start;
vis[node]=1;
queue<int>q;
q.push(node);
while(!q.empty()){
        int n=q.front();
        q.pop();
        cout<< n<< " ";
        for(auto it : adj[n]){
                if(!vis[n]){
        //      cout<< it<<" ";
                vis[it]=1;
                q.push(it);
                }
        }
}
}
int main(){
int edges=0,nodes=0;
cout<<"Enter the Number of nodes and Edges\n";
        cin>>nodes>>edges;
int vis[nodes]={0};
vector<int>adj[nodes];
for(int i=0;i<edges;i++){
        int u,v;
        cout<<"Enter u and v: ";
        cin>>u>>v;
        adj[u].push_back(v);
        adj[v].push_back(u);
}
for(int i=0;i<nodes;i++){
        if(!vis[i]){
                bfs(adj,vis,i);
        }
        }
}
