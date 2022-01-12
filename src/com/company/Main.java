package com.company;

public class Main {

    public static void main(String[] args){
        Singleton k=Singleton.getInstance();
        System.out.println(k);
    }

    }

class Singleton{
    private static Singleton instance=null;
    private Singleton() {
        System.out.println('+');
    }
    public static Singleton getInstance(){
        if (instance==null){
            instance=new Singleton();
        }
        return instance;
    }
    public void l1z1(){
        System.out.println('+');
    }
}
