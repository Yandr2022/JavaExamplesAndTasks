package by.yandr.myLearning.javaSE.examplesAndTasks.DataManipulationAndAlgorithms;

public class UpCase {
    public static void main(String[] args) {
        char ch;
        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch + " - ");
            ch = (char) ((int) ch & 0xffdf);//65503 = 1111 1111 11!0!1 1111
            System.out.print(ch + "\n");
        }
    }
}
