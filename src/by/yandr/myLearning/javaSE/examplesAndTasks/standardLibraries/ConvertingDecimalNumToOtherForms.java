package by.yandr.myLearning.javaSE.examplesAndTasks.standardLibraries;

public class ConvertingDecimalNumToOtherForms {
    public static void main(String[] args) {
        int decimal = 63;
        String str = "111111";
        decimal = Integer.parseInt(str, 2);
        str = Integer.toString(decimal, 2);
        System.out.printf("decimal: %d\nstr: %s", decimal, str);
        decimal = Integer.parseInt("77", 8);
        str = Integer.toString(decimal, 8);
        System.out.printf("\ndecimal: %d\nstr: %s", decimal, str);
        decimal = Integer.parseInt("3F", 16);
        str = Integer.toString(decimal, 16);
        System.out.printf("\ndecimal: %d\nstr: %s", decimal, str);


    }
}
