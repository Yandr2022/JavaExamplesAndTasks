package by.yandr.myLearning.javaSE.examplesAndTasks.DataManipulationAndAlgorithms;

import java.io.PrintStream;

public class ShowBitsDemo {
    private static PrintStream out = System.out;

    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);
        b.show(123, out);
        i.show(123, out);
        li.show(123, out);
        b.show(87987, out);
        i.show(87987, out);
        li.show(87987, out);

        //simple exchange for bytes type size
        int val = 123;
        for (int t = 128; t > 0; t /= 2) {
            out.print((val & t) != 0 ? "1" : "0");
        }
    }
}

class ShowBits {
    private int numBits;

    public ShowBits(int numBits) {
        this.numBits = numBits;
    }

    public String getBinaryForm(long val) {
        long mask = 1;
        StringBuilder builder = new StringBuilder();
        mask <<= numBits - 1;

        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            builder.append((val & mask) != 0 ? "1" : "0");
            spacer++;
            if (spacer % 8 == 0) {
                builder.append(" ");
                spacer = 0;
            }
        }
        return builder.toString();
    }

    public void show(long val, PrintStream out) {
        String binary = getBinaryForm(val);
        out.println(binary);
    }
}

