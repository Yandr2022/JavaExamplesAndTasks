package by.yandr.myLearning.javaSE.examplesAndTasks.standardLibraries;

import java.io.*;

public class ReadInput {
    String cmd = null;
    Process proc = null;
    InputStream stream = null;
    BufferedReader in = null;

    public ReadInput(String cmd) throws IOException {
        this.cmd = cmd;
        try {
            proc = Runtime.getRuntime().exec(cmd);
            stream = proc.getInputStream();
            in = new BufferedReader(new InputStreamReader(stream));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public String readLine() throws IOException {
        String line = in.readLine();
        while (line == "\r" || line == " ") {
            line = readLine();
        }
        return line;
    }

    public void close() {
        try {
            in.close();
            stream.close();
            proc.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            in = null;
            stream = null;
            proc = null;
        }

    }

    public static void main(String[] args) {
        String cmd = null;
        ReadInput in = null;
        if (args.length > 0) {
            cmd = args[0];
        } else {
            cmd = "ping localhost";
        }
        try {
            in = new ReadInput(cmd);
            String line = null;
            while ((line = in.readLine()) != null) {
                if (line != "\r") {
                    PrintStream ps = new PrintStream(System.out,true,"Cp866");
                    System.setOut(ps);
                    System.out.println("java:> " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            in.close();
            in = null;
        }

    }
}