package String;

/* Write a program to combine two strings by alternating their characters.
str1 = "abc"
str2 = "1234"
o/p=a1b2c34
 */
public class AlternateCharacters {
    public static void main(String[] args){
        String str1="abc";
       // char[] arr1=str1.toCharArray();
        String str2="1234";
        //char[] arr2=str2.toCharArray();
        String output="";
        for(int i=0; i<str1.length(); i++){
            if (i < str1.length()) {
                output += str1.charAt(i);
            }
            if (i < str2.length()) {
                output += str2.charAt(i);
            }
            }


        System.out.println(output);
        }

}
