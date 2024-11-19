package org.example;

public class DayTwo {
    public static void main(String[] args) throws InterruptedException {
        example();
    }

    public static void work(int n, int x) {
        for (int i = 1; i <= n; i++) {
            try {
                Thread.sleep(x);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println((int)((i /(double)n) * 100) + " %");
            System.out.println(Thread.currentThread());
        }
        System.out.println("конец");
    }

    private static void example() {
        Thread t1 = new Thread(() ->  work(10, 4000), "поток t1");
        Thread t2 = new Thread(() ->  work(5, 7000), "поток t2");
        Thread t3 = new Thread(() ->  work(17, 2000), "поток t3");

        t1.start();
        t2.start();
        t3.start();
    }
}

