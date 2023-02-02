package by.yandr.myLearning.javaSE.examplesAndTasks.DataManipulationAndAlgorithms;

import java.nio.charset.StandardCharsets;

import static java.util.Base64.*;

public class UseBase64Coding {
    public static void main(String[] args) {
//        if(args.length ==0){
//            System.out.println("usage: Base64 text");
//            System.exit(1);
//        }
//        String text = args[0];
        String text = "Test text";
        Encoder base64 = getEncoder();
        text = base64.encodeToString(text.getBytes(StandardCharsets.UTF_8));
        System.out.println(text);
        text = new String(getDecoder().decode(text));
        System.out.println(text);
    }
}
