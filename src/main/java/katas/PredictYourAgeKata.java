package katas;

import com.sun.tools.jconsole.JConsoleContext;

import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;



public class PredictYourAgeKata {
    public int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8){

        List<Integer> listOfAges = List.of(age1, age2, age3, age4, age5, age6, age7, age8);

        var sumAges = listOfAges.stream()
                .mapToInt(age ->
                        age * age)
                .sum();

        return (int) Math.sqrt(sumAges) / 2;
    }
}
