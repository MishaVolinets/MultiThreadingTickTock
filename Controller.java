package com.MishaVolinets._11_multithreading03;

/**
 * Created by misha on 04.08.16.
 */
public class Controller {

    public boolean status = false;
    public static boolean stop = false;

    public void Tick(){
        while (status){
            try {
                wait();
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        };
        System.out.print("Tick ");
        status = true;
        try {
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        notify();
    }
    public void Tock(){
        while (!status){
            try {
                wait();
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }

        }
        System.out.println("Tock");
        status = false;
        try {
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        notify();
    }

}
