package Arrays;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 0, 1};
        int[] num2 = new int[]{0, 1};
        int[] num3 = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] num4 = new int[]{40, 43, 42, 18, 6, 13, 19, 8, 44, 4, 12, 22, 31, 30, 10, 16, 3, 17, 25, 7, 41, 21, 48, 26, 32, 27, 49, 15, 1, 20, 35, 46, 11, 23, 2, 0, 38, 28, 37, 9, 39, 47, 36, 45, 24, 34, 29, 14, 33};

        System.out.println(solution(nums) + " is the missing number in the range since it does not appear in " + Arrays.toString(nums));
        System.out.println(solution(num2) + " is the missing number in the range since it does not appear in " + Arrays.toString(num2));
        System.out.println(solution(num3) + " is the missing number in the range since it does not appear in " + Arrays.toString(num3));
        System.out.println(solution(num4) + " is the missing number in the range since it does not appear in " + Arrays.toString(num4));
    }


    public static int solution(int[] nums) {
        int res = nums.length; // start with n to get the left number after the iteration

        for (int i = 0; i < nums.length; i++) {
            res += i - nums[i];
        }

        //in the first example [3,0,1] the iteration return's -1 and the sum = -1 + 3 (n) = 2 the left number
        return res;
    }

}
