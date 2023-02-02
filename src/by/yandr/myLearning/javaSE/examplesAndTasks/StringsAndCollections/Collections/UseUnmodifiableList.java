package by.yandr.myLearning.javaSE.examplesAndTasks.StringsAndCollections.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UseUnmodifiableList {
    public static void main(String[] args) {
//        List names = Arrays.asList(new String[]{"Andrew","Kate","Jonathan"});
        List names = Arrays.asList("Andrew","Kate","Jonathan");
        List list = new ArrayList<>(names);
        list = Collections.unmodifiableList(list);
        try {
            list.set(0,"test");
        }catch (UnsupportedOperationException exc){
            System.out.println("this is unmodifiable List");
        }
        System.out.println(list);
    }
}
