package by.yandr.myLearning.javaSE.examplesAndTasks.StringsAndCollections.Strings;

import java.io.UnsupportedEncodingException;

public class StringMethodsTest {
    public static void main(String[] args) {
        String str = "Java";
        String concat = str.concat(" will save the world");
        System.out.println(str);
        System.out.println(concat + '\n');

        String subString = concat.substring(10, 24);
        System.out.println(subString + '\n');

        String[] letters = {"e", "w", "x"};
        int first, last;
        for (String letter : letters) {
            first = subString.indexOf(letter);
            last = subString.lastIndexOf(letter);
            System.out.println(letter + " - first: " + (first == -1 ? "not found" : first) +
                    ", last: " + (last == -1 ? "not found" : last));
        }

        System.out.println();
        letters[0] = "Java";
        letters[1] = "rld";
        letters[2] = "hello";
        System.out.println(concat);
        for (String letter : letters) {
            System.out.println(String.format("%s  %s", letter,
                    (concat.startsWith(letter) ? "- to start" : concat.endsWith(letter) ? "- to end" : "not found")));
        }

        System.out.println();
        StringBuffer buffer = new StringBuffer(concat.length());
        for (int i = concat.length() - 1; i >= 0; i--) {
            buffer.append(concat.charAt(i));
        }
        System.out.println("reverse for '" + concat + "'\n" + buffer);

        System.out.println("\nreplace v to W for '" + concat + "'\n" + concat.replace("v", "W"));

        System.out.println("\n" + subString + "\n to Lower Case: " + subString.toLowerCase() +
                "\n to Upper Case: " + subString.toUpperCase());

        String[] strs = {"421.5e10", "421.5e1", "421", "421"};

        double d = Double.parseDouble(strs[0]);
        float f = Float.parseFloat(strs[1]);
        long l = Long.parseLong(strs[2]);
        int i = Integer.parseInt(strs[3]);

        for (int j = 0; j < strs.length; j++) {
            switch (i){
                case 0: String.valueOf(d);break;
                case 1: Float.toString(f);break;
                case 2: String.valueOf(l);break;
                case 3: Integer.toString(i);break;
            }
        }

        String strUC ="abc\u5639\u563b";
        try {
            byte []utf8 = strUC.getBytes("UTF-8");
            strUC = new String(utf8,"UTF-8");
        } catch (UnsupportedEncodingException e) {
        }
        System.out.println("\n"+strUC);
    }
}
