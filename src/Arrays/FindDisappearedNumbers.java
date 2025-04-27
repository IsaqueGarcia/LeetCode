package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDisappearedNumbers {

    public static void main(String[] args) {
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        int[] nums1 = new int[]{1,1};
        int[] nums2 = new int[]{1,2};
        int[] nums3 = new int[]{1,1,2,2};
        System.out.println(solution(nums));
        System.out.println(solution(nums1));
        System.out.println(solution(nums2));
        System.out.println(solution(nums3));
    }


    public static List<Integer> solution(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> removeDuplicate = new HashSet<>();

        for (int num : nums) {
            removeDuplicate.add(num);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!removeDuplicate.contains(i)) {
                res.add(i);
            }
        }

        return res;
    }

}
