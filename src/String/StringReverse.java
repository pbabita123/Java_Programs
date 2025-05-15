package String;
/*this p[rogram to reverse a string
I/p=Hello
o/p=olleH

i/p=My name is Babita.
o/p=.atibaB si eman yM
 */

public class StringReverse {
    public static  void  main(String[] args){
        String str="My name is Babita.";
        String str1="";

        for(int i=str.length()-1;i>=0;i--){
            //System.out.println(str1+str.charAt(i));
             str1=str1+str.charAt(i);
         }
        System.out.println(str1);
    }


}
