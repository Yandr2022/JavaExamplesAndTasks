package by.yandr.myLearning.javaSE.examplesAndTasks.standardLibraries;

import java.io.IOException;

public class OpeningFilesInExternApp {
    public static void main(String[] args) {
        String appHell = null;
        Runtime rtm = Runtime.getRuntime();
        boolean win = System.getProperty("os.name").toLowerCase().startsWith("win");
        if (win) {
            appHell = "start MyHelpPage.html";
        } else {
            appHell = "<path> MyHelpPage.html";
        }

        try {
            rtm.exec(appHell);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
