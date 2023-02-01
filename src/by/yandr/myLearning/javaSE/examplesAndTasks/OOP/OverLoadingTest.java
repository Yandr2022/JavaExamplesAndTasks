package by.yandr.myLearning.javaSE.examplesAndTasks.OOP;

public class OverLoadingTest {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.pay(25.34);
        basket.pay("123456789");
        basket.pay("123456789", "BYSB1023");
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
        System.out.println("transfer to account number " + accNum + " in the bank " + bankCode);
    }

}
