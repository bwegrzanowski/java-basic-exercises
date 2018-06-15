package randomExercisesv2;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sum(12));
        System.out.println(changeChar("mamamamaa", 'a', 'i'));
//        System.out.println(dividerBySign("123.123.1111", '.'));
        System.out.println(isPalindrome("kajak"));
//        System.out.println(Arrays.toString(fibonacci(0,1,6)));
        System.out.println(switchChar('c'));
        System.out.println(switchCaseString("AbCd"));
        System.out.println("a;b;c)" + getNthIndexOf(';', "a;b;c", 0));
//        long startTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(dividerBySign("ab;cd;ef", ';')));
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime - startTime);
        System.out.println(Arrays.toString(dividerBySign2("ab;cd;ef", ';')));
        System.out.println(isBracketCorrect("(ada(dad()))"));
        System.out.println(reverse("abcdef"));
        System.out.println(Arrays.toString(reversedArray(new int[]{1, 2, 3, 4, 5, 6})));
        System.out.println(tree(5));
        System.out.println(whichStringIsBigger("1245", "1244"));
    }

    //silnia (factorial) -> long
    public static long factorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = (long) (factorial * i);
        }
        return factorial;
    }

    public static int sum(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0 && i % 3 != 0)
                sum = sum + i;
        }
        return sum;
    }

    //string character changing
    public static String changeChar(String text, char c, char d) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                chars[i] = d;
            }
        }
        return String.valueOf(chars);
    }

    //palindrome checking
    public static boolean isPalindrome(String text) {
        char[] chars = text.toCharArray();
        boolean result = true;
        int i = 0;
        while (i <= chars.length / 2 && (chars[i] == chars[chars.length - i - 1])) {
            i++;
        }
        return i == chars.length / 2;

    }


    //split-> 123;abc;dd -> ["123", "abc", "dd"]
    //         123.abc.dd.
    public static String[] dividerBySign(String text, char sign) {
        String[] resultArray = new String[randomExercisesv2.Warmup.lettersCounter(text, sign) + 1];
        String textToPut = "";
        int j = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != sign) {
                textToPut += text.charAt(i);
                if (i == text.length() - 1) {
                    resultArray[j] = textToPut;
                }
            } else {
                resultArray[j] = textToPut;
                j++;
                textToPut = "";
            }
        }
        return resultArray;
    }

    public static String[] dividerBySign2(String message, char c) {
        String[] resultArray = new String[randomExercisesv2.Warmup.lettersCounter(message, c) + 1];
        int start = 0;
        int end = 0;
        for (int i = 0; i < resultArray.length; i++) {
            String textToPut = "";
            end = getNthIndexOf(c, message, (i + 1));
            for (int j = start; j < end; j++) {
                textToPut += message.charAt(j);
            }
            resultArray[i] = textToPut;
            start = end + 1;
        }
        return resultArray;
    }

    public static int getNthIndexOf(char c, String text, int index) {
        char[] chars = text.toCharArray();
        int i = -1;
        while (i < chars.length && index > 0) {
            i++;
            if (i < chars.length && c == chars[i]) {
                index--;
            }
        }
        return i;
    }

    //        int sizeOfArray = Warmup.lettersCounter(text, sign) +1;
//        String[] array = new int[sizeOfArray];
//
//        String dividedWord = "";
//        char[] textAsCharArray = text.toCharArray();
//        for (int i = 0; i < textAsCharArray.length; i++) {
//            if (textAsCharArray[i] == sign){
//
//            } else {
//                dividedWord = dividedWord + textAsCharArray[i];
//            }
//            strings[i] = dividedWord;
//        }
//        return strings;
//    }

    //switch case - inverting font size
    public static char switchChar(char c) {
        char d = c;
        if (d >= 'A' && d <= 'Z') {
            d += 32;
        } else if (d >= 'a' && d <= 'z') {
            d -= 32;
        }
        return d;
    }

    public static String switchCaseString(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = switchChar(chars[i]);
        }
        return String.valueOf(chars);
    }

//   // fibonacci
//    public static int[] fibonacci (int a, int b, int steps) {
//        int[] numbers = new int[steps];
//        numbers[0] = a;
//        numbers[1] = b;
//        for (int i = 2; i <= steps; i++) {
//            numbers[i] = numbers[i - 2] + numbers[i - 1];
//        }
//        return numbers;
//    }

    //fibonacci v2
    public static int fibonacciNumber(int n) {
        int first = 0;
        int second = 1;
        if (n <= 1) return n;
        for (int i = 2; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        return second;
    }
    // string reversing: "abcd" -> "dcba"

    public static String reverse(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char a = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = a;
        }
        return String.valueOf(chars);
    }

    public static boolean isBracketCorrect(String text) {
        char[] chars = text.toCharArray();
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            while (i < chars.length && counter < 2) {
                if (chars[i] == '(') {
                    counter++;
                    i++;
                } else if (chars[i] == ')') {
                    counter--;
                    i++;
                } else {
                    i++;
                }
            }

        }
        return counter < 2;
    }

    public static boolean isValidStatement(String statement) {
        char[] array = statement.toCharArray();
        int i = 0;
        int counter = 0;
        while (i <= array.length && counter >= 0) {
            if (array[i] == '(') {
                counter++;
            } else if (array[i] == ')') {
                counter--;
            }
            i++;
        }
        return counter >= 0;
    }


    public static int whichStringIsBigger(String number1, String number2) {
        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        if (a > b) {
            return 1;
        } else if (a < b) {
            return -1;
        } else {
            return 0;
        }
    }

// v2
    public static int compare(String first, String second) {
        int result = 0;
        if (first.length() > second.length()) {
            result = 1;
        } else if (first.length() < second.length()) {
            result = -1;
        } else {
            int i = 0;
            while (i < first.length()) {
                if (first.charAt(i) > second.charAt(i)) {
                    result = 1;
                } else if (first.charAt(i) < second.charAt(i)) {
                    result = -1;
                } else
                    i++;
            }
        }

        return result;
    }

    //metoda wyswietlajaca sume liczb pierwszych w danej liczbie (1,2,3,5,7,11)
    //                          liczba 29 -> 11+11+7
    public static String divisibility(int number) {
        int[] primeNumbers = {1, 2, 3, 5, 7, 11};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = primeNumbers.length - 1; i >= 0; i++) {
            while (number >= primeNumbers[i]) {
                number -= primeNumbers[i];
                stringBuilder.append(primeNumbers[i]);
                stringBuilder.append(" + ");
            }
        }
        return stringBuilder.substring(0, stringBuilder.length() - 2);
    }

    //reverse array
    public static int[] reversedArray(int[] numbers) {
        int[] array = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            array[i] = numbers[numbers.length - i - 1];
        }
        return array;
    }

    //tree
    public static String tree(int height) {
        StringBuilder treeBuilder = new StringBuilder();
        String tree = "";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - 1 - i; j++) {
                treeBuilder.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                treeBuilder.append("*");
            }
            treeBuilder.append("\n");
        }
        return treeBuilder.toString();
    }


}
