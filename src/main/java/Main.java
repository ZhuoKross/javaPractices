import Excel_Implementation.ReadFile;
import katas.KataExercises;

public class Main {
    public static void main(String[] args){
        KataExercises kataClass = new KataExercises();

        ReadFile reader = new ReadFile();

        reader.readExcel();
    }
}
