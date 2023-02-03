package by.yandr.myLearning.javaSE.examplesAndTasks.standardLibraries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadInput {
    String cmd = null;
    Process proc = null;
    InputStream stream = null;
    BufferedReader in = null;

    public ReadInput(String cmd) {
        this.cmd = cmd;
        try {
            proc = Runtime.getRuntime().exec(cmd);
            stream = proc.getInputStream();
            in = new BufferedReader(new InputStreamReader(stream));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
           InputStream stream =  Runtime.getRuntime().exec("ping localhost").getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(stream));
            String line = in.readLine();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
