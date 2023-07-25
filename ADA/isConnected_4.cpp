#include<bits/stdc++.h>
using namespace std;

 void dfs(int start,vector<int> adj[],int vis[]){

int node=start;
vis[start]=1;

for(auto it:adj[node]){
        if(!vis[it]){
        dfs(it,adj,vis);
        }
        }

}


int main(){
int nodes,edges;
cout<<"Enter the number of nodes and edges\n";
cin>>nodes>>edges;
vector<int> adj[nodes];
int vis[nodes]={0};

for(int i=0;i<edges;i++){
int u,v;
cout<<"Enter u and v values\n";
cin>>u>>v;
adj[u].push_back(v);
adj[v].push_back(u);
}
int count=0;
for(int i=0;i<nodes;i++){
        if(!vis[i]){
                count++;
        dfs(i,adj,vis);
        }

}
if(count>1)
        cout<<"It is not connected graph\n";
        else
        cout<<"IT is connected graph\n";

}
