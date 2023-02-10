package by.yandr.myLearning.javaSE.examplesAndTasks.standardLibraries;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.PrintStream;

public class TextOutputToFile {
    public static void main(String[] args) {
        try {
            PrintStream errOut = new PrintStream(new FileOutputStream("Error.log"));
            System.setErr(errOut);
            PrintStream sysOut = new PrintStream(new FileOutputStream("Debug.log"));
            System.setOut(sysOut);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("messages about normal program operation");
        System.err.println("messages about errors to program operation");
    }
}
