package Week2.Day1;

import java.util.Scanner;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
    int[] arr = new int[26];
     for(char ch :ransomNote.toCharArray()) {
         arr[ch - 'a']++;
     }
     for (char ch : magazine.toCharArray()) {
         arr[ch - 'a']--;
     }
     for(int i:arr) {
         if (i > 0)
             return false;
     }
     return true;

}
public static void main(String[] args){
        Scanner ad = new Scanner(System.in);
        String ransomNote = ad.nextLine();
        String magazine = ad.nextLine();
       boolean k =  canConstruct(ransomNote,magazine);
        System.out.println(k);
    }}
