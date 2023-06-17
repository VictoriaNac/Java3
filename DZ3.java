//Пусть дан произвольный список целых чисел.
//1) Нужно удалить из него чётные числа
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение

import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Random;

public class Lab3 {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(15));
        }
        System.out.println(list);
        System.out.println(removeEvenNumber(list));
        list.sort(Comparator.naturalOrder());
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
        System.out.println(findMiddle(list));

    }

    public static ArrayList<Integer> removeEvenNumber (ArrayList<Integer> list){
/*     int s = list.size();
       for (int i = 0; i < s; i++) {
            if (list.get(i)%2 == 0){
                list.remove(i);
                i--;
                s--;
            }
        }*/
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i % 2 == 0) iterator.remove();
        }
        return list;
    }

    public static Integer findMiddle (ArrayList<Integer> list){
        int summ = 0;
        for (int i: list){
            summ +=  i;
        }
        return summ / list.size();
    }
}