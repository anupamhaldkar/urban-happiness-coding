class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> left = new HashMap<>(),
                                 right = new HashMap<>(),
                                 count = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            if(left.get(x)==null){
                left.put(x,i);
            }
            right.put(x,i);
            count.put(x,count.getOrDefault(x,0)+1);
        }
        int ans=nums.length;
        int degree = Collections.max(count.values());
        for(int x,y:count<Integer,Integer>){
            if(count.get(x)==degree)
                ans = Math.min(right.get(x)-left.get(x)+1,ans);
                
        }
        return ans;
    }
}
