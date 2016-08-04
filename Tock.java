package com.MishaVolinets._11_multithreading03;

/**
 * Created by misha on 04.08.16.
 */
public class Tock implements Runnable {
    public Thread t;
    public Controller c;

    Tock(Controller c){
        this.c = c;
        t = new Thread(this,"TockThread");
        t.start();
    }
    @Override
    public void run() {
        synchronized (c){
            for(int i = 1;!Controller.stop;i++){
                c.Tock();
                if(i == 5)Controller.stop = true;
            }
        }

    }
}
