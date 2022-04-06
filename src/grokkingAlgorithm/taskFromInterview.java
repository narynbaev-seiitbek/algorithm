package grokkingAlgorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class taskFromInterview {
    public static void main(String[] args) {

        //[-3,0,1,3,4] , k=5

        int[] nums =new int[]{0,2,7,11,15,0};
        int target=9;

        System.out.println(Arrays.toString(twoSum1(nums, target)));
        System.out.println(Arrays.toString(twoSumSet(nums, target)));
        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSumTwo(nums, target)));
    }
    private static int[] twoSum1(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

    private static int[] twoSumSet(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int numberToFind = target-nums[i];
            if (set.contains(numberToFind)) {
                return new int[]{numberToFind,nums[i]};
            }
            set.add(nums[i]);
        }
        return new int[0];
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int numberToFind = target-nums[i];
            int l=i+1,r=nums.length-1;
            while (l<=r) {
                int mid=l+(r-l)/2;
                if (nums[mid]==numberToFind) {
                    return new int[]{i,mid};
                }
                if (numberToFind<nums[mid]) {
                    r=mid-1;
                }else {
                    l=mid+1;
                }
            }
        }
        return new int[0];
    }


    private static int[] twoSumTwo(int[] nums,int target) {
        int l=0, r= nums.length-1;
        while (l<r) {
            int sum = nums[l]+nums[r];
            if (sum==target) {
                return new int[]{l,r};
            }
            if (sum<target) {
                l++;
            }else {
                r--;
            }
        }
        return new int[0];
    }
}
