
package rekursifmetot;


public class tersCevir {

    public static String reverse(String str) {
        // BASE CASE
        if (str.length() <= 1) {
            return str;
        }

        // SON HARF + geri kalanın tersi
        return str.charAt(str.length() - 1) 
               + reverse(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        String input = "java";
        System.out.println(reverse(input));
    }
}
