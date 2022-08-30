import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        
        // push unique elements to queue
        Queue<Integer> q = new LinkedList<>();
        int last = 101;
        for (int i : nums) {
            if (i != last) {
                q.add(i);
                last = i;
            }
        }
        // change the array
        int i = 0;
        while (!q.isEmpty()) {
            nums[i] = q.remove(); 
            i++;
        }
        return i;
    }
}