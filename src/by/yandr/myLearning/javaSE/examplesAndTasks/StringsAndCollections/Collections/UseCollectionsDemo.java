package by.yandr.myLearning.javaSE.examplesAndTasks.StringsAndCollections.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UseCollectionsDemo {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("key", 1.23);
        double val = (double) map.get("key") * 2.0;
        map.put("x2key", val);

        for (Iterator it = map.values().iterator(), itK = map.keySet().iterator(), itE = map.entrySet().iterator(); it.hasNext(); ) {
            System.out.println(itK.next() + ": " + it.next());
            Map.Entry entry = (Map.Entry) itE.next();
            System.out.println(entry.getClass() + " - " + entry.getValue() + ": " + entry.getKey());
        }
    }
}
