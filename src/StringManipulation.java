import java.util.Scanner;

public class StringManipulation {

//    private char Alphabet;
//
//    public char getAlphabet() {
//        return Alphabet;
//    }
//
//    public void setAlphabet(char alphabet) {
//        Alphabet = alphabet;
//    }
//
//    public StringManipulation() {
//    }
//
//    public String getReversedWord() {
//        return ReversedWord;
//    }
//
//    public void setReversedWord(String reversedWord) {
//        ReversedWord = reversedWord;
//    }
//
//    private static char ReversingFunction() {
//        char[] Letters = new char[ReversedWord.length()];
//        char
//        for (int i = 0; i < ReversedWord.length(); i++) {
//            Letters[i] = ;
//        }
//
//        return Alphabet;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Enter the name: \n");
//
//        if(userInput.hasNextLine()) {
//            ReversedWord = userInput.nextLine();
//        }
//
//        System.out.println(ReversingFunction());
//    }
//    public static void PigLatin(String word) {
//        char End = word.charAt(0);
//        String EditWord = word.substring(1);
//
//        System.out.printf("%", EditWord);
//        System.out.printf("% -ay", End);
//    }

    public static String getReversedWord() {
        return ReversedWord;
    }

    public static void setReversedWord(String reversedWord) {
        ReversedWord = reversedWord;
    }

    private static String ReversedWord;
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        //user input
        System.out.println("Enter Word: \n");

        //trying to put some error checking for when a user presses enter without having entered any value
        if (System.in.toString() == null) {

            System.out.println("Please type something");

        } //validates that there is a value and assigns it to the variable
        if (userInput.hasNextLine()) {

            ReversedWord = userInput.nextLine();

        }

        System.out.println("Reversed: " + Gobbledygook.Jumble());


        //assesses if the word is a palindrome
        System.out.println( ReversedWord.equals( new StringBuilder(ReversedWord).reverse().toString())
                ? "It's a palindrome" : "Not a palindrome" );

        //counts vowels in word
        System.out.println("Vowel Count: " + Vowels.countVowel(ReversedWord));

        //translates the word into pig latin
        System.out.println(PigLatin.IgPay());



        /* next steps:

           Put each function in its own method for code readability
           Make the functions execute for each word by splitting the input into a string array
           Read/write to a file

         */
    }


}
