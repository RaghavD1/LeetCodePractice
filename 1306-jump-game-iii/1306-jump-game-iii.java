class Solution {
    public boolean canReach(int[] arr, int start)
    {
        boolean [] visited=new boolean[arr.length];
        visited[start]=true;
        return solve(arr,start,visited);
    }
    public boolean solve(int [] arr,int idx,boolean [] visited)
    {
        if(idx<0||idx>=arr.length)return false;
        if(arr[idx]==0)return true;
        boolean left=false;
        if( idx-arr[idx]>=0 && idx-arr[idx]<arr.length && visited[idx-arr[idx]]==false)
        {
            visited[idx-arr[idx]]=true;
            left=solve(arr,idx-arr[idx],visited);
        }
        else left=false;
        boolean right=false;
        if(idx+arr[idx]>=0 && idx+arr[idx]<arr.length && visited[idx+arr[idx]]==false)
        {
            visited[idx+arr[idx]]=true;
            right=solve(arr,idx+arr[idx],visited);
        }
        else right=false;
        return left||right;
    }
}