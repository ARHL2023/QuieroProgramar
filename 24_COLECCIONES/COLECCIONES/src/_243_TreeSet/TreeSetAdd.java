package _243_TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetAdd {
    public static void main(String[] args) {

        Set<String>ts = new TreeSet<>(Comparator.reverseOrder());//con el parametro se orden descendente

        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cuatro");

        System.out.println("ts = " + ts);

        Set<Integer>ts2 = new TreeSet<>((a,b)->b.compareTo(a));

        ts2.add(1);
        ts2.add(2);
        ts2.add(3);
        ts2.add(4);
        ts2.add(4);


        System.out.println("ts2 = " + ts2);

    }
}
