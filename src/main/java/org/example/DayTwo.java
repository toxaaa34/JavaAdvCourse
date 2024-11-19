package org.example;

public class DayTwo {
    public static void main(String[] args) throws InterruptedException {
        example();
    }

    private static void example() {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println((int)((i/10d) * 100) + " %");
                System.out.println(Thread.currentThread());
            }
            System.out.println("конец");
        }, "поток t1");

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println((int)((i/5d) * 100) + " %");
                System.out.println(Thread.currentThread());
            }
            System.out.println("конец");
        }, "поток t2");

        Thread t3 = new Thread(() -> {
            for (int i = 1; i <= 7; i++) {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println((int)((i/7d) * 100) + " %");
                System.out.println(Thread.currentThread());
            }
            System.out.println("конец");
        }, "поток t3");

        t1.start();
        t2.start();
        t3.start();
    }
}

