class Solution {
    public int climbStairs(int n) {
       // HashMap<Integer, Integer> map = new HashMap<>();
        int j= solve(n,0,new HashMap<Integer,Integer>());
        return j;
    }
    public int solve(int n,int o,HashMap<Integer,Integer> memo)
    {
        if(o==n)
            return 1;
        if(o>n)
            return 0;
        if(memo.containsKey(o))return memo.get(o);
       int h=solve(n,o+1,memo)+solve(n,o+2,memo);
       memo.put(o,h);
        return h;
    }
}
