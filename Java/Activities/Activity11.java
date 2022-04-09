package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args)
    {
        HashMap <Integer,String> colors = new HashMap<Integer, String>();
        colors.put(1,"RED");
        colors.put(2,"BLUE");
        colors.put(3,"YELLOW");
        colors.put(4,"BLACK");
        colors.put(5,"WHITE");

            System.out.println(" Colors are " + colors);
        colors.remove(3);
        System.out.println(" check whether GRREN is there " + colors.containsValue("GREEN"));
        System.out.println("Size of hash map is  " + colors.size());


    }
}
