package com.MishaVolinets._11_multithreading03;

/**
 * Created by misha on 04.08.16.
 */
public class Tick implements Runnable {
    Thread t;
    Controller c;
    public Tick(Controller c){
        this.c = c;
        t = new Thread(this,"TickThread");
        t.start();
    }

    @Override
    public void run() {
        synchronized (c){
            for(int i = 1;!Controller.stop;i++){
                c.Tick();
                if(i == 5)Controller.stop = true;
            }

        }
    }
}
