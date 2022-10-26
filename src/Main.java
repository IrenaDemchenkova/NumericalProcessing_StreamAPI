import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        System.out.println(isPositiveNumbers(intList));
        System.out.println(isEvenNumber(intList));
        System.out.println(sortArray(intList));
    }

    public static List<Integer> isPositiveNumbers(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    public static List<Integer> isEvenNumber(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }
    public static List<Integer> sortArray (List<Integer> list) {
       Collections.sort(list);
        return list;
    }
}