package task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// Заполнить список десятью случайными числами.
//        Отсортировать список методом sort() и вывести его на экран.
public class Task1 {
    public static void main(String[] args) {
        Random rd = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <10; i++) {
            list.add(rd.nextInt(1,11));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
