package net.ukr.ahavrykin;

public class Main {
    public static void main(String[] args) {

        ThreadsTask[] factorial = new ThreadsTask[100];
        Thread[] threadArr = new Thread[100];

        for (int i = 0; i < factorial.length; i++) {
            factorial[i] = new ThreadsTask(i);
            threadArr[i] = new Thread(factorial[i]);
            threadArr[i].start();
            try {
                threadArr[i].join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Main ended");
    }
}
