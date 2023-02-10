package by.yandr.myLearning.javaSE.examplesAndTasks.standardLibraries;

import java.io.IOException;

public class ExecProcess {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("notepad.exe");
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
