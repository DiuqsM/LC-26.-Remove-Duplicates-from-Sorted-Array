class Solution1 {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> map = new ArrayList<Integer>(); 
        int j = 0; 
        for(int i = 0; i < nums.length; i++){
            if(!map.contains(nums[i])){
            map.add(nums[i]); 
            }
        }
        for(int i = 0; i < map.size(); i++){
            nums[i] = map.get(i); 
        }
        return map.size();
    }
}