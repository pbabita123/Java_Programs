package String;

public class DescendingLongString {
    public  static void main(String[] args){
        String str1="banana is fruit";
        String[] arr1= str1.split(" ");
        String str2="";
        DescendingLongString cls= new DescendingLongString();
        for(int i=0; i<arr1.length;i++){
            str2 = str2+" " +cls.descendingstring(arr1[i]);
        }
        str2=str2.trim();
        System.out.println(str2);
    }
    public String descendingstring(String str1){
        //String str1="banana";
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
        str1=new String(arr1);
        //System.out.println(str1);
        return str1;
    }
}
