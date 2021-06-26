class Solution {
    public int maximumWealth(int[][] accounts) {
         int m= accounts.length;
        if(m==0) return 0;
        int n= accounts[0].length;
        int ans=0;
        for(int i=0;i<m;i++){
            int res=0;
            for(int j=0;j<n;j++){
                res+=accounts[i][j];
            }
            ans= Math.max(ans,res);
        }
        return ans;
    }
}
