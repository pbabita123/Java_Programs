package String;

//Write a program to check if the given string is a pallindrome or not.

public class StringPallindrome {
    public  static  void  main(String[] args){
        String str="acca";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println("STring is Pallindrome");
        }
        else{
            System.out.println("not Pallindrome");
        }
    }
}
