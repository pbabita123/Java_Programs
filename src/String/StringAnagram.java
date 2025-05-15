package String;
//Write a program to verify if 2 strings are anagram to each other.
//i/p="listen" o/p="silent"
public class StringAnagram {
    public static void main(String[] args) {
        String str1="silent";
        String str2="listen";
        StringAnagram sa=new StringAnagram();

        if(sa.sorting(str1).equals(sa.sorting(str2))){
            System.out.println("String is anagram");
        }
        else {
            System.out.println("String is not anagram");
            System.out.println("Hell");
        }

    }

    public String sorting(String str1){
        //String str1="silent";
        char[] arr1=str1.toCharArray();
        for(int i=0; i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]>arr1[j]){
                    char temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                    //System.out.println(arr1[i]);
                }
            }
        }
       str1= new String(arr1);

       // System.out.println(str1);
        return str1 ;


    }
}

