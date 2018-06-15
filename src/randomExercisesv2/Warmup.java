package randomExercisesv2;

public class Warmup {
    public static void main(String[] args) {
        String[] array = {"anna", "majaAAA", "ola", "przemek"};
        System.out.println(femaleNames(array));
        System.out.println(lettersCounter("djaofaoifaof", 'c'));
        System.out.println(lettersCounter("Anna", 'a'));
        System.out.println(lettersCounter(array, 'a'));
    }

    public static int femaleNames(String[] array) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            String name = array[i];
            if (array[i].endsWith("a")) {
                counter++;
            }

        }
        return counter;
    }

    public static boolean endWith(String text, String searchingValue) {
        boolean result = false;
        if (searchingValue.length() <= text.length()) {
            int i = searchingValue.length() - 1;
            char[] textAsCharArray = text.toCharArray();
            char[] searchValueAsCharArray = searchingValue.toCharArray();
            int aLength = textAsCharArray.length;
            int bLength = searchValueAsCharArray.length;

            while (i >= 0 && searchValueAsCharArray[i] == textAsCharArray[aLength + i - bLength]) {
                i--;
            }
            result = i == -1;
        }
        return result;
    }

    public static int lettersCounter(String[] message, char c) {
        int counter = 0;
        for (int i = 0; i < message.length; i++) {
            counter += lettersCounter(message[i], c);
        }
        return counter;
    }


    public static int lettersCounter(String text, char c) {
        char[] chars = text.toCharArray();
        int counter = 0;
        char capitalizedChar = capitalize(c);

        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == c) {
                counter++;
            }
        }
        return counter;
    }

    public static char capitalize(char c) {
        return (c >= 'a' && c <= 'z') ? (char) (c - 32) : c;
    }

}
