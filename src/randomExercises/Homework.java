package randomExercises;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        //kodowanie i odkodowywanie szyfru cezara
        int offset = 1;
        String secretMessage = "ala ma kotaZz";
        String expectedMessage = "bmb nb lpubAa";

        char[] chars = secretMessage.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z'|| chars[i]>='A' && chars[i]<='Z'){
                if ((chars[i] + offset) > 'Z' && (chars[i] + offset)< 'a'){
                    chars[i] = (char) (chars[i] - 26 +offset);
                } else if (chars[i] +offset >'z'){
                    chars[i] =(char) (chars[i] - 26 +offset);
                } else {
                    chars [i] = (char) offset;
                }
            }
        }

        //decoder
        String codedMessage = "cnc cc mqvBc ba";
        int offsetDecode = 2;

        char[] charsOfCoddedMessage = codedMessage.toCharArray();

        for (int i = 0; i < charsOfCoddedMessage.length; i++) {
            if (charsOfCoddedMessage[i] >= 'a' && charsOfCoddedMessage[i] <= 'z'|| charsOfCoddedMessage[i]>='A' && charsOfCoddedMessage[i]<='Z'){
                if ((charsOfCoddedMessage[i] + offset) > 'Z' && (charsOfCoddedMessage[i] + offset)< 'a'){
                    charsOfCoddedMessage[i] = (char) (charsOfCoddedMessage[i] - 26 +offset);
                } else if (charsOfCoddedMessage[i] +offset >'z'){
                    charsOfCoddedMessage[i] =(char) (charsOfCoddedMessage[i] - 26 +offset);
                } else {
                    charsOfCoddedMessage [i] = (char) offset;
                }
            }
        }
        System.out.println(expectedMessage.equals(String.valueOf(chars)));
        System.out.println(expectedMessage);
        System.out.println(String.valueOf(chars));


        int[] numbers = {1,2,3,4,6,7,8};
        int searchingNumber =4;

        int i = 0;
        while(i< numbers.length && numbers[i] != searchingNumber) {

            i++;
        }
        if (i<numbers.length){
            int[] smallerNumbersArray = new int[i+1];
            int[] biggerNumbersArray = new int[numbers.length - (i+1)];

            for (int j = 0; j < smallerNumbersArray.length; j++) {
                smallerNumbersArray[j] = numbers[j];

            }
            for (int j = 0; j < biggerNumbersArray.length; j++) {
                biggerNumbersArray[j] = numbers[j + 1 +i];
            }
            System.out.println(Arrays.toString(smallerNumbersArray));
            System.out.println(Arrays.toString(biggerNumbersArray));

        } else{
            System.out.println("number " +searchingNumber + " not found");
        }



    }
}
