import java.util.Arrays;
import java.util.Comparator;

public class Task5 {
    public static String meeting(String s) {
        String[] names = s.toUpperCase().split(";");

        Arrays.sort(names, Comparator.comparing((String name) -> name.split(":")[1])
                .thenComparing((String name) -> name.split(":")[0]));

        StringBuilder result = new StringBuilder();
        for (String name : names) {
            String[] parts = name.split(":");
            result.append("(").append(parts[1]).append(", ").append(parts[0]).append(")");
        }
        return result.toString();
    }
}
