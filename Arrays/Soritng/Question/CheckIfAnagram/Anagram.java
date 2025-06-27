package Soritng.Question.CheckIfAnagram;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (checkAnagram(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }

    }

    public static boolean checkAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int[] arr1 = new int[26];
        for(int i = 0; i < 26; i++) {
            arr1[i] = 0;
        }
        for(int i = 0; i < s1.length(); i++){
            int index = s1.charAt(i) - 'a';
            arr1[index] += 1;
        }
        for(int i = 0; i < s2.length(); i++){
            int index = s2.charAt(i) - 'a';
            arr1[index] -= 1;
        }
        for(int i = 0; i < 26; i++ ){
            if(arr1[i] != 0){
                return false;
            }
        }
        return true;
    }
}
