import java.util.ArrayList;
import java.util.List;

public class Task1{
    public static List<Integer> getIntegersFromList(List<Object> list) {
        List<Integer> result = new ArrayList<>();

        for (Object element : list) {
            if (element instanceof Integer) {
                result.add((Integer) element);
            }
        }

        return result;
    }
}
