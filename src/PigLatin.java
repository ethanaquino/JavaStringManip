public class PigLatin extends StringManipulation{

    public static String IgPay() {
        char End = getReversedWord().charAt(0);
        String EditWord = getReversedWord().substring(1);

        String AtinLay = "Pig Latin: " + EditWord + "-" + End + "ay";

        return AtinLay;
    }

}
