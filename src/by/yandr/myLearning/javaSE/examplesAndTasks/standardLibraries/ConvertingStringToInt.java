package by.yandr.myLearning.javaSE.examplesAndTasks.standardLibraries;

public class ConvertingStringToInt {
    public static void main(String[] args) {
        String strV = "101";
        int intV = Integer.parseInt(strV);
        System.out.println(intV + 2);
        strV = Integer.toString(intV);
//        strV = intV+"";
        System.out.println(strV + 2);

    }
}
