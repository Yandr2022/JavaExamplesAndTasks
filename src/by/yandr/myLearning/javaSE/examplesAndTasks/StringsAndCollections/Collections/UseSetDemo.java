package by.yandr.myLearning.javaSE.examplesAndTasks.StringsAndCollections.Collections;

import java.util.*;

public class UseSetDemo {
    public static void main(String[] args) {
        Set set1 = new HashSet<>();//List list1 = new ArrayList();
        Set set2 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        set2.add("D");
        System.out.println("set1: " + set1+"\nset2: " + set2);

        set2.addAll(set1);
        System.out.println("set2.addAll(set1):");
        System.out.println("set1: " + set1+"\nset2: " + set2);

        System.out.println("set1T =new HashSet<>(set1); set1T.removeAll(set2):");
        Set set1T =new HashSet<>(set1);
        set1T.removeAll(set2);
        System.out.println("set1T: " + set1T+"\nset2: " + set2);
        System.out.println("set2T =new HashSet<>(set2); set2T.removeAll(set1):");
        Set set2T =new HashSet<>(set2);
        set2T.removeAll(set1);
        System.out.println("set1: " + set1+"\nset2T: " + set2T);

        System.out.println("set1.retainAll(set2): "+set1.retainAll(set2));
        System.out.println("set1: " + set1+"\nset2: " + set2);
        System.out.println("set2.retainAll(set1): "+set2.retainAll(set1));
        System.out.println("set1: " + set1+"\nset2: " + set2);

        set2.clear();
        System.out.println("set2.clear():");
        System.out.println("set2: " + set2);

        List list = new  ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list = "+list);
         list.subList(2, list.size()).clear();
        System.out.println("list.subList(2, list.size()).clear():\nlist ="+list);



    }
}
