import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task4 {
    public static int countPairsWithSumFor(Integer[] arr, int target) {
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        Integer[] array = set.toArray(new Integer[0]);

        Map<Integer, Integer> freqMap = new HashMap<>();

        int count = 0;

        for (int num : array) {
            int complement = target - num;

            if (freqMap.containsKey(complement)) {
                count += freqMap.get(complement);
            }
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        return count;
    }

    public static long countPairsWithSumStream(Integer[] arr, int target) {
        return Arrays.stream(arr)
                .filter(num -> Arrays.stream(arr).anyMatch(innerNum -> innerNum + num == target))
                .count() / 2;
    }
}
