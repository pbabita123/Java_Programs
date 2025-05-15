package array;

/**
 *  Find the average value of an array from its' elements
 *  I/P - {10,5,10,15}
 *  O/P - 10
 *  (formula to find avg value = Sum of all elements / length of an array)
 * */
public class ArrayAvgCalculatorFromElements {
    public static void main(String[] args){
        int[] newar= {10,5,10,15};
        ArrayAvgCalculatorFromElements a = new ArrayAvgCalculatorFromElements();
        int arrayAvg=a.findAvg(newar);
        System.out.println(arrayAvg);
        }

    public int findAvg(int[] arr1){
        int sum=0;
        int avg;
        for(int i=0; i<arr1.length; i++ ){
            sum=sum+arr1[i];
        }
        avg=sum/arr1.length;
        return avg;
    }
}
