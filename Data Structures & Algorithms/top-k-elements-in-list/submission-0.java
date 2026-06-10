class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
        }
        int res[]=new int[k];
        for(int i=0;i<k;i++){
        int maxfreq=0;
        int maxvalue=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>maxfreq){
                maxvalue=entry.getKey();
                maxfreq=entry.getValue();
            }
        }
        res[i]=maxvalue;
        
        map.remove(maxvalue);
        }
        return res;
    }
}
