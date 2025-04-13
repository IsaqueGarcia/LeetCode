package Arrays;

import java.util.HashSet;

public class DuplicateValues {

    public static void main(String[] args) {
        int [] nums = new int[] {1,2,3,1,1,5};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        //So, we can resolve this using the set and compare the len...
        HashSet<Integer> numSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            numSet.add(nums[i]);
        }
        return numSet.size() != nums.length;
    }

}
