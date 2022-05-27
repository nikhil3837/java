/* Write a program to calculate the sum and average of an array of 1000 integers (generated 
randomly) using 10 threads. Each thread calculates the sum of 100 integers. Use these 
values to calculate average. [Use join method ].*/

import java.util.*;

class thread1 implements Runnable {
    Thread t;
    int i, no, sum;
    int a[] = new int[1000];

    thread1(String s, int n) {
        Random rs = new Random();
        t = new Thread(this, s);
        no = n;
        int j = 0;
        for (i = 1; i <= 1000; i++) {
            a[j] = rs.nextInt() % 100;
            j++;
        }
        t.start();
    }

    public void run() {
        for (i = 0; i < 100; i++) {
            sum = sum + a[no];
            no++;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Avg =" + sum / 100);
    }

}

public class slip1_2 {
    public static void main(String[] arg) throws InterruptedException {
        thread1 t1 = new thread1("g", 1);
        t1.t.join();
        thread1 t2 = new thread1("r", 100);
        t2.t.join();
        thread1 t3 = new thread1("s", 200);
        t3.t.join();
        thread1 t4 = new thread1("t", 300);
        t4.t.join();
        thread1 t5 = new thread1("p", 400);
        t5.t.join();
        thread1 t6 = new thread1("p", 500);
        t5.t.join();
        thread1 t7 = new thread1("p", 600);
        t5.t.join();
        thread1 t8 = new thread1("p", 700);
        t5.t.join();
        thread1 t9 = new thread1("p", 800);
        t5.t.join();
        thread1 t10 = new thread1("p", 900);
        t5.t.join();

    }
}