package by.yandr.myLearning.javaSE.examplesAndTasks.OOP;

public class InterfacesDemo {
    public static void main(String[] args) {
        ExampleIF anIf = new ExampleIF();
       if (anIf instanceof A) {
           anIf.methA();
           anIf.methB();
       }
    }
}
interface A{
    void methA();
}
interface B extends A{
    void methB();
}
class ExampleIF implements B{
    @Override
    public void methA() {
        System.out.println("method A");
    }

    @Override
    public void methB() {
        System.out.println("method B");
    }
}