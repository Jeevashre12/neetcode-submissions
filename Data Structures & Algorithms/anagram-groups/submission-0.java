class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,List<String>> mp =new HashMap<>();
        for(String s:strs){
            char[] arr=new char[26];
            for(char c:s.toCharArray()){
                arr[c-'a']++;
            }
        String key=Arrays.toString(arr);
        if(!mp.containsKey(key)){
            mp.put(key,new ArrayList<>());
        }

        mp.get(key).add(s);
        
        }
        return new ArrayList<>(mp.values());
    }
}
