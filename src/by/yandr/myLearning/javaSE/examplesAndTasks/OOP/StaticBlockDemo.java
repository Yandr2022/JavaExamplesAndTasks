package by.yandr.myLearning.javaSE.examplesAndTasks.OOP;

public class StaticBlockDemo {
    public static void main(String[] args) {
        System.out.println("call static variable1: "+StaticBlock.rootOf9);
        System.out.println("call static variable2: "+StaticBlock.rootOf27);

        StaticBlock block = new StaticBlock(4);
        System.out.println("call variable of instance: "+block.number);

    }
}
class StaticBlock{
    static double rootOf9;
    static double rootOf27;
    int number;
static {
    System.out.println("Initializing static members of class");
    rootOf9 = Math.sqrt(9);
    rootOf27 = Math.sqrt(27);
}

    public StaticBlock(int number) {
        System.out.println("Initializing of class instance variables");
        this.number = number;
    }
}