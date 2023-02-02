package by.yandr.myLearning.javaSE.examplesAndTasks.DataManipulationAndAlgorithms;

public class LowCase {
    public static void main(String[] args) {
        char ch;
        for (int i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch + " - ");
            ch = (char) ((int) ch | 0x20);//32 = 0000 0000 00!1!0 0000
            System.out.print(ch + "\n");
        }
    }
}
