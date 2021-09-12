package com.ales;



public class Main {

    public static void main(String[] args) throws InterruptedException {

        Fork fork2PL1 = new Fork("2P-L1");     // 1
        Fork fork3PL2 = new Fork("3P-L2");     // 2
        Fork fork4PL3 = new Fork("4P-L3");     // 3
        Fork fork5PL4 = new Fork("5P-L4");     // 4
        Fork fork6PL5 = new Fork("6P-L5");     // 5
        Fork fork7PL6 = new Fork("7P-L6");     // 6
        Fork fork8PL7 = new Fork("8P-L7");     // 7
        Fork fork9PL8 = new Fork("9P-L8");     // 8
        Fork fork10PL9 = new Fork("10P-L9");     // 9
        Fork fork1PL10 = new Fork("1P-L10");     // 10


        Philosopher philosopher1 = new Philosopher("1", fork2PL1, fork1PL10);
        Philosopher philosopher2 = new Philosopher("2", fork3PL2, fork2PL1);
        Philosopher philosopher3 = new Philosopher("3", fork4PL3, fork3PL2);
        Philosopher philosopher4 = new Philosopher("4", fork5PL4, fork4PL3);
        Philosopher philosopher5 = new Philosopher("5", fork6PL5, fork5PL4);
        Philosopher philosopher6 = new Philosopher("6", fork7PL6, fork6PL5);
        Philosopher philosopher7 = new Philosopher("7", fork8PL7, fork7PL6);
        Philosopher philosopher8 = new Philosopher("8", fork9PL8, fork8PL7);
        Philosopher philosopher9 = new Philosopher("9", fork10PL9, fork9PL8);
        Philosopher philosopher10 = new Philosopher("10", fork1PL10, fork10PL9);




        philosopher1.start();
        philosopher3.start();
        philosopher5.start();
        philosopher7.start();
        philosopher9.start();

        philosopher1.join();

        philosopher2.start();
        philosopher4.start();
        philosopher6.start();
        philosopher8.start();
        philosopher10.start();


    }
}
