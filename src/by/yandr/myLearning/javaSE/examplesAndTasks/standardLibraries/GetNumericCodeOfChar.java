package by.yandr.myLearning.javaSE.examplesAndTasks.standardLibraries;

public class GetNumericCodeOfChar {
    public static void main(String[] args) {
        char ch = 'B';
        int numCode = ch;
        System.out.println(ch +": "+ numCode);
        ch = (char) numCode;
        System.out.println(numCode +": "+ ch);
    }
}
