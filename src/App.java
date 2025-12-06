import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Given an integer array 'nums' and an integer 'k', return the 'k' most
         * frequent elements.
         * You may return the answer in any order.
         * 
         * Input=[1,1,1,2,2,3], k = 2
         * Output= [1,2]
         * 
         * Input=[1], k = 1
         * Output=[1]
         */
        System.out.println("Hello, World!");
        int[] input = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        Solution solution = new Solution();
        int[] answer = solution.topKFrequent(input, k);
        System.out.println(
                "The given inout is: " + Arrays.toString(input) + " and the outout is: " + Arrays.toString(answer));

    }
}
