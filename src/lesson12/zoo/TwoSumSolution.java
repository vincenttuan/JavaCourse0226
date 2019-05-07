package lesson12.zoo;

public class TwoSumSolution {
    public static void main(String[] args) {
        int[] int_array = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(int_array, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
    
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        loop:
        for(int i=0;i<nums.length;i++) {
            for(int j=1; j<nums.length;j++) {
                if(target - nums[i] == nums[j]) {
                    result[0] = i;
                    result[1] = j;
                    break loop;
                }
            }
        }
        return result;
    }
}
