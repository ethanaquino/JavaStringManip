public class Vowels extends StringManipulation {

    public static int countVowel(String word) {
        int count = 0;
        for (int i =0 ;i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'A' ||
                    word.charAt(i) == 'e' || word.charAt(i) == 'E' ||
                    word.charAt(i) == 'i' || word.charAt(i) == 'I' ||
                    word.charAt(i) == 'o' || word.charAt(i) == 'O' ||
                    word.charAt(i) == 'u' || word.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }


}
