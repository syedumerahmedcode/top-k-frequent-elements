
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        // Handling edge case
        if (k == nums.length) {
            return nums;
        }
        // creating a hashmap
        Map<Integer, Integer> occuranceCount = new HashMap<>();
        for (int n : nums) {
            /** populate the values inside the count hashmap */
            occuranceCount.put(n, occuranceCount.getOrDefault(n, 0) + 1);
        }
        // create a priority queue and assign the method of insertion based on number of
        // occurances based of the count hashmap
        // priorityQueueWithInsertionOrderForHighestOccurance(we have named it 'heap')
        Queue<Integer> heap = new PriorityQueue<>(
                (a, b) -> occuranceCount.get(a) - occuranceCount.get(b));
        /**
         * Iterate over the all the key present inside the count hashmap that is
         * created.
         * For every key, we are going to add the value to our heap priority queue.
         * 
         * When the priority queue gets full to the size of the k, we pop the element.
         * The element that gets popped is going to be the least occurring element.
         * 
         * This way, we only keep higher occurring element in our heap.
         */
        for (int n : occuranceCount.keySet()) {
            heap.add(n);
            // if heapsize > k, we remove the value from the heap
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = heap.poll();
        }
        return answer;
    }
}
