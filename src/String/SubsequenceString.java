package String;
//Write a program to determine if one string is a subsequence of another.
//i/p="abc"and str2="agvbhgc"
public class SubsequenceString {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "agvbhgc";
        for (int i = 0, j = 0; i < str1.length() && j < str2.length(); i++, j++) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
               // System.out.println(str1.charAt(i));
            }
            else{
                j++;
            }
            System.out.println(str1.charAt(j));
        }

    }

}
