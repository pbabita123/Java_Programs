package array;

/**
 * Given an array arr. The task is to find the largest element in the given array.
 *
 * Examples:
 *
 * Input: arr[] = [10, 20, 4]
 * Output: 20
 * Explanation: Among 10, 20 and 4, 20 is the largest.
 *
 *
 * Input: arr[] = [20, 10, 20, 4, 100]
 * Output: 100
 */
public class LargestElementFinder {
    public static void main(String[] args){
        int[] arr1={1000, 10,500, 20, 4, 100,-5};
        LargestElementFinder a= new LargestElementFinder();
        int largest= a.findLargets(arr1);
        System.out.println(largest);
    }

    public int findLargets(int[] arr1){
        int large=0;

        for(int i=0; i<arr1.length; i++) {
            if (large < arr1[i]) {
                large = arr1[i];
            }
        }

        return large;
    }
}
