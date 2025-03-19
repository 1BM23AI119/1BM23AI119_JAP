public class string_func {
    public static boolean compare(String str1,String str2){
        return str1.equals(str2);
    }
    public static int compares(String str1,String str2){
        return str1.compareTo(str2);
    }
    public static String concate(String str1,String str2){
        return str1+str2;
    }
    public static String copy(String str1){
        return new String(str1);
    }
    public static void main(String args[]){
        String str1="Java";
        String str2="Domain";
        int res1=compares(str1,str2);
        boolean res2=compare(str1,str2);
        String res3=concate(str1,str2);
        System.out.println("" + res1);
        System.out.println("" + res2);
        System.out.println("" + res3);
        System.out.println(copy(str1));

    }
}
/*6
false
JavaDomain
Java

Process finished with exit code 0
*/
