public class Solution {
    public int RemoveDuplicates(int[] nums) {
        int count = 0;
        int temp = 101;
        foreach (int i in nums) {
            if (temp != i) {
                temp = i;
                nums[count] = i;
                count++;
            }
        }
        return count;
    }
}