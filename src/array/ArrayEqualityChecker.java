package array;

/**
 *  Write a program to check if 2 arrays are equal to each other.
 *  I/P - a[] = {"Sita", "Gita", "Mita"}
 *        b[] = {"Sita", "Gita", "Mita"}
 *  O/P - boolean true if 2 arrays are equal
 *                false otherwise
 */
public class ArrayEqualityChecker {
    public static void  main(String[] args){
        String  str="Identical";
        int[] a={1,2,3};
        int[] b={1,2,3};
        boolean flag = true;
        for(int i=0,j=0; i<a.length && j<b.length;i++,j++){
            if (a[i]!= b[j]){
               // str= "Not identical";
               flag = false;
                break;
            }
        }
       System.out.println(flag);
       // System.out.println(str);
    }
}
