package String;
/*Write a program to locate the first occurrence of a substring within a string.
str1="Hello world"
str2="world"
o/p=6
 */

public class FirstoccurenceOfSubstring {
    public static void main(String[] args){
        String str1="Hello world34 try world34";
        String[] arr1=str1.split(" ");
        String str2="world34";
        int i=0;

        FirstoccurenceOfSubstring cls=new FirstoccurenceOfSubstring();
       boolean output=cls.checkSubstring(str1,str2);
       if(output){
           for(int k=0;k< arr1.length;k++){
               if(arr1[k].equals(str2)){
                   System.out.println(k);
                   break;
               }
           }
       }

    }
    public boolean checkSubstring(String str1,String str2){
       // String str1="Hello world34 try";
        String[] arr1=str1.split(" ");
       // String str2="try";
        int i=0;
        for(int k=0;k< arr1.length;k++){
            if(arr1[k].equals(str2)){
                return true;


            }
        }
        return false;
    }

}
