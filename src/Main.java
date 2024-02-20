import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        List<Object> example1 = new ArrayList<>(List.of(1, 2, 'a', 'b'));
        List<Object> example2 = new ArrayList<>(List.of(1, 2, 'a', 'b', 0, 15));
        List<Object> example3 = new ArrayList<>(List.of(1, 2, 'a', 'b', "aasf", "1", "123", 231));
        System.out.println(task1.getIntegersFromList(example1));
        System.out.println(task1.getIntegersFromList(example2));
        System.out.println(task1.getIntegersFromList(example3));

        Task2 task2 = new Task2();
        System.out.println(task2.firstNonRepeatingLetter("stress"));
        System.out.println(task2.firstNonRepeatingLetter("sTreSS"));
        System.out.println(task2.firstNonRepeatingLetter("sTreSST"));

        Task3 task3 = new Task3();
        System.out.println("16, res = " + task3.digitalRoot(16));
        System.out.println("942, res = " + task3.digitalRoot(942));
        System.out.println("132189, res = " + task3.digitalRoot(132189));
        System.out.println("493193, res = " + task3.digitalRoot(493193));

        Task4 task4 = new Task4();
        Integer[] arr = {1, 3, 6, 2, 2, 0, 4, 5};
        int target = 5;
        System.out.println("Number of pairs with sum " + target + ": " + task4.countPairsWithSumFor(arr, target));
        System.out.println("Number of pairs with sum " + target + ": " + task4.countPairsWithSumStream(arr, target));

        Task5 task5 = new Task5();
        String guests = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
        System.out.println(task5.meeting(guests));

        ExtraTask1 extraTask1 = new ExtraTask1();
        System.out.println(extraTask1.nextBigger(12));
        System.out.println(extraTask1.nextBigger(513));
        System.out.println(extraTask1.nextBigger(2017));
        System.out.println(extraTask1.nextBigger(9));
        System.out.println(extraTask1.nextBigger(111));
        System.out.println(extraTask1.nextBigger(531));

        ExtraTask2 extraTask2 = new ExtraTask2();
        System.out.println(extraTask2.intToIp(2149583361L));
        System.out.println(extraTask2.intToIp(32L));
        System.out.println(extraTask2.intToIp(0L));

    }
}