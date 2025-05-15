package String;
/*Write a program to reverse the order of words in a string without altering the words themselves.
i/p="My name is khan"
o/p="khan is name My"
 */
public class ReverseWordOrder {
    public static void main(String[] args){
        String input = "My name is khan";
        String[] arr1=input.split(" ");

        String output ="";
        for(int i=arr1.length-1;i>=0;i--){
            output=output+" " + arr1[i];
        }
       // output=new String();
        System.out.println(output);
    }
}
