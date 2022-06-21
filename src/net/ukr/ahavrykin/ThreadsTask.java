package net.ukr.ahavrykin;

import java.math.BigInteger;

public class ThreadsTask implements Runnable {
    private int number;
    private BigInteger factorial;

    public ThreadsTask(int number) {
        this.number = number;
        factorial = BigInteger.ZERO;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public BigInteger getFactorial() {
        return factorial;
    }

    public void setFactorial(BigInteger factorial) {
        this.factorial = factorial;
    }

    @Override
    public void run() {
        Thread thr= Thread.currentThread();
        BigInteger fact= BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(thr.getName()+" factorial " + number + " != " + fact);
    }
}
