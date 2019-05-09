public class Gobbledygook extends StringManipulation{

    public static String Jumble() {
        StringBuilder Backward = new StringBuilder();

        Backward.append(StringManipulation.getReversedWord());

        Backward = Backward.reverse();

        return Backward.toString();
    }
}
