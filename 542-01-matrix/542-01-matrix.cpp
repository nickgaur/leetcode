class Solution {
public:
    vector<vector<int>> updateMatrix(vector<vector<int>>& mat) {
        int m=mat.size(),n=mat[0].size();
        vector<vector<int>> res(m,vector<int>(n,0));
        queue<pair<int,int>> q;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.push({i,j});
                    mat[i][j]=-1;
                }
                else
                    count++;
            }
        }
        vector<int> dir={0,1,0,-1,0};
        while(!q.empty()){
            if(count==0)
                break;
            int si=q.size();
            while(si){
                auto cur=q.front();
                q.pop();
                si--;
                for(int i=0,j=1;j<5;i++,j++){
                    int x=cur.first+dir[i],y=cur.second+dir[j];
                    if(x==m||y==n||x==-1||y==-1||mat[x][y]==-1)
                        continue;
                    mat[x][y]=-1;
                    count--;
                    res[x][y]=res[cur.first][cur.second]+1;
                    q.push({x,y});
                }
                if(count==0)
                    break;
            }
        }
        return res;
    }
};