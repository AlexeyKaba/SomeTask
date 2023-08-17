import java.util.HashMap;
public class Solution {
    public static void main(String[] args) {
        for (int i : twoSum(new int[]{0,3,-3,4,-1}, -1)){
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> remnantList = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (remnantList.containsKey(num)) {
                int j = remnantList.get(num);
                int remnant = nums[j];
                if (remnant + num == target){
                    return new int[]{j, i};
                }
            }
            int diff = target - num;
            if (!remnantList.containsKey(diff)) remnantList.put(diff,i);
        }


        return new int[]{};
    }
}
