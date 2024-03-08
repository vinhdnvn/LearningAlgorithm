

// Solution 1 : Using brute force
class Solution {
    public boolean containsDuplicate(int[] nums) {
       
        for (int i =0; i <nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[j] == nums[i]) {
                    return true;
                }
                
            }
        }
        return false;
        
    }
}

// Solution 2 : Using another
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}

// Solution 3 : Using sorting
