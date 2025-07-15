import katas.PredictYourAgeKata;

public class Main {
    public static void main(String[] args){
        System.out.println("it works");

        PredictYourAgeKata predictYourAge = new PredictYourAgeKata();

        System.out.println(predictYourAge.predictAge(65,60,75,55,60,63,64,45));
    }
}
