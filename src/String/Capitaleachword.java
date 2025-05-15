package String;

public class Capitaleachword {
    public  static  void main(String[] args){
        String str1="my name is babita";
        String[] arr1=str1.split(" ");

        String a ="";
        for(int i=0;i<arr1.length;i++){
            /**
             *   a = My
             *   a = My + Name
             *   a = My Name + Is
             *   a = My Name Is + Babita + " "
             */
            a =a+" " +arr1[i].substring(0,1).toUpperCase()+arr1[i].substring(1);
            // o/p - My Name Is Babita
        }
        System.out.println(a.toCharArray().length);
        a= a.trim();
        System.out.println(a);
    }
}
