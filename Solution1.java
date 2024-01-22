class Solution1 {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> map = new ArrayList<Integer>(); 
        int j = 0; 
        //iterate through the num array skipping and adding it to the ArrayList while skipping the ones that are already in the array list
        for(int i = 0; i < nums.length; i++){
            if(!map.contains(nums[i])){
            map.add(nums[i]); 
            }
        }

        //updates the num augment to the arraylist
        for(int i = 0; i < map.size(); i++){
            nums[i] = map.get(i); 
        }
        return map.size();
    }
}
