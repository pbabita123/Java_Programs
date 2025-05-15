package String;

/*Write a program to sort the characters of a string in a descending lexicographical order.
i/p='banana'
o/p="nnbaaa"
 */

public class Descendingstring {
    public static void  main(String[] args){
        String str1="banana";
        char[] arr1=str1.toCharArray();
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]<arr1[j]){
                    char temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        System.out.println(arr1);
    }
}
