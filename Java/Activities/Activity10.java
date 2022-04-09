package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
    public static void main(String[] args)
    {
        HashSet<String> hs=new HashSet<String>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");
        System.out.println("Size of hash set is  " + hs.size());
        hs.remove("F");
        hs.remove("S");
        System.out.println(" check whether f is there " + hs.contains("F"));
        for (String s:hs
             ) {
            System.out.println(s);
        }

    }
}
