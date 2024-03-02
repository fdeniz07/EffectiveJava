package Chapter1_Object.item6_AutoBoxing_Unboxing;

import java.util.ArrayList;
import java.util.List;

public class ItemSixTest {

    private static long topla() {
        Long sum = 0L;
        for (long i = 0; i < 10000; i++) {
            sum += i;
        }
        return sum;
    }


    public static void main(String[] args) {

        String kelime = new String("bikini");
        String kelime2 = "bikini";
        String kelime3 = "bikini";

        System.out.println(kelime == kelime2);
        System.out.println(kelime2 == kelime3);

        long startTime = System.nanoTime();
        topla();
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
        // 303711
        //5599


        //Integer number = 100;

        //Autoboxing - Unboxing
        ArrayList<Integer> integer = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            integer.add(i);
            // i = Integer.valueOf(i);
        }

        List<Integer> li = new ArrayList<>();
        int sum = 0;
        for (Integer i : li) {
            if (i % 2 == 0) // i.intValue()
                sum += i;
        }
    }
}
