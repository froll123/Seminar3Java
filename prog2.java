package Seminar3Java;

import java.util.ArrayList;
import java.util.Random;


public class prog2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-1000, 1000);
            list1.add(val);
        }
        System.out.printf("изначальный список %s\n", list1);
        int i = 0;
        while (i < list1.size()) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("список с удаленными четными числами %s", list1);
    }
}