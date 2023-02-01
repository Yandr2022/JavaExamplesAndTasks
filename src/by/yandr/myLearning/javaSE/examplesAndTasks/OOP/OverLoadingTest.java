package by.yandr.myLearning.javaSE.examplesAndTasks.OOP;

public class OverLoadingTest {
    public static void main(String[] args) {

    }
}

class Basket {

    void pay(double cash) {
        System.out.println("paid in cash: " + cash);
    }

    void pay(String cardNum) {
        System.out.println("paid in card number: " + cardNum);
    }

    void pay(String accNum, String bankCode) {
        System.out.println("transfer to account number " + bankCode + " in the bank " + accNum);
    }

}
