package katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class KataExercises {
    public String BuildSquare(int number){

        String square = "";
        int counter = 1;

        while (counter <= number){
            for(int i = 0; i < number; i++){
                square = square.concat("+");
            }

            if(counter != number){
                square = square.concat("\n");
            }
            counter++;

        }


        System.out.println(square);


        return square;
    }

    public int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8){

        List<Integer> listOfAges = List.of(age1, age2, age3, age4, age5, age6, age7, age8);

        var sumAges = listOfAges.stream()
                .mapToInt(age ->
                        age * age)
                .sum();

        return (int) Math.sqrt(sumAges) / 2;
    }

    public int[] CountCharacters (String chars){
        int lenghtChars = chars.length();
        int[] charsCount = new int[4];

        System.out.println("Length of the chars: " + lenghtChars);

        for (int i = 0; i < lenghtChars; i++){

            char currentLetter = chars.charAt(i);
            String currentLetterString = String.valueOf(currentLetter);


            if (Pattern.matches("[A-Z]", currentLetterString)){
                charsCount[0] = charsCount[0] + 1;
            } else if (Pattern.matches("[a-z]", currentLetterString)) {
                charsCount[1] = charsCount[1] + 1;
            }else if (Pattern.matches("[0-9]", currentLetterString)){
                charsCount[2] = charsCount[2] + 1;
            }else if (Pattern.matches("\\W", currentLetterString)){
                charsCount[3] = charsCount[3] +1 ;
            }
        }

        System.out.println("chars count: " + Arrays.toString(charsCount));
        return charsCount;
    }

    public int tvRemote(String word){
        List<List<String>> keyboard = new ArrayList<>();


        return 0;
    }

}


