import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(4,7,1,6,8,9,3,12,11);
        System.out.println("Среднее значение всех четных чисел: ");
        OptionalDouble average=numbers.stream().filter(x -> x % 2 == 0).mapToInt(x -> x).average();
        System.out.println(average.getAsDouble());

    }
}