package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoNumbers {

    public static void main(String[] args) {
        //Example 1:
        //
        //Input: nums = [2,7,11,15], target = 9
        //Output: [0,1]
        //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        //Example 2:
        //
        //Input: nums = [3,2,4], target = 6
        //Output: [1,2]
        //Example 3:
        //
        //Input: nums = [3,3], target = 6
        //Output: [0,1]


        int[] nums = new int[]{2,7,11,15};
        int[] num1 = new int[]{3,2,4};
        int[] num2 = new int[]{3,3};
        System.out.println(Arrays.toString(solution(nums, 9)));
        System.out.println(Arrays.toString(solution(num1, 6)));
        System.out.println(Arrays.toString(solution(num2, 6)));
    }

    public static int[] solution(int[] nums, int target){
        //can't use the same element twice
        //return the index not the numbers
        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int i = 0; i < nums.length; i ++) {
                int temp = nums[i];

                if(hash.containsKey(target - temp)){
                    return new int[]{i, hash.get(target - temp)};
                }
                    hash.put(nums[i], i);
        }

        return new int[]{};
    }
}
