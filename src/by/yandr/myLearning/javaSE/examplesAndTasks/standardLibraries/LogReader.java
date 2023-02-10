package by.yandr.myLearning.javaSE.examplesAndTasks.standardLibraries;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LogReader {
    public static void main(String[] args) {

//        if (args.length == 0) {
//            System.out.println("call: Java LogReader");
//            System.exit(0);
//        }
//
//        String fileLog = null;
        BufferedReader br = null;
        try {
//            fileLog = args[0];
            String fileLog = "text.log";
            br = new BufferedReader(new InputStreamReader(new FileInputStream(fileLog)));
            while (true) {
                String line = br.readLine();
                if (line != null) {
                    System.out.println(line);
                } else {
                    try {
                        Thread.sleep(500);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
