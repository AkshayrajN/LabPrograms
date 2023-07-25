
#include<bits/stdc++.h>
using namespace std;

void dfs(int start,vector<int>adj[],stack<int>&st,vector<bool>&vis){

        int node=start;
        vis[start]=true;

        for(auto it: adj[node]){
                if(!vis[it])
                dfs(it,adj,st,vis);
        }
        st.push(node);
}

int main(){

        int nodes,edges;
        cout<<"Enter the number of nodes and edges\n";
        cin>>nodes>>edges;
        vector<int>adj[nodes];
        vector<bool>vis(nodes,false);
        for(int i=0;i<edges;i++){
                int u,v;
                cout<<"Enter u and v values: \n";
                cin>>u>>v;
                adj[u].push_back(v);

        }
        stack<int>st;
        for(int i=0;i<nodes;i++){
                if(!vis[i])
        dfs(i,adj,st,vis);
        }
        while(!st.empty()){
                cout<<st.top()<<" ";
                st.pop();
        }

}
