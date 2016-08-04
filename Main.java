package com.MishaVolinets._11_multithreading03;

/**
 * Created by misha on 04.08.16.
 */
public class Main {
    public static void main(String[] args) {
        Controller c = new Controller();
        Tock tock = new Tock(c);
        Tick tick = new Tick(c);
        try {
            tock.t.join();
            tock.t.join();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println("Main Thead is end!");
    }
}
