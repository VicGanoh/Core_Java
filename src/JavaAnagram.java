import java.util.Scanner;

public class JavaAnagram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean reference = isAnagram(a,b);
        System.out.println(reference ? "Anagram" : "Not Anagram");

    }

    static boolean isAnagram(String a , String b){
        if (a.length() != b.length() && a.length() < 1 && b.length() > 50) {
            return false;
        }


        char c[] = new char[26];
        char d[] = new char[26];
        a = a.toLowerCase();
        b = b.toLowerCase();
        for (int i=0;i<a.length();i++){
            c[a.charAt(i) - 'a']++;
            d[b.charAt(i) - 'a']++;
        }
        for (int i=0;i<26;i++){
            if (c[i] != d[i])
                return false;
        }
        return true;
    }
}
