package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args)
    {
        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("Renuka");
        mylist.add("Manisha");
        mylist.add("Megha");
        mylist.add("Shweta");
        mylist.add("Apoorva");
        for (String i:mylist
             ) {
            System.out.println( i+ " ");
        }

        System.out.println( " 3rd name in mylist is"+ mylist.get(2));
        System.out.println(" Check if Renuka is present in list" + mylist.contains("Renuka"));
        System.out.println("Size of array is" + mylist.size());
        mylist.remove("Shweta");
        System.out.println("Size of array is" + mylist.size());
    }
}
