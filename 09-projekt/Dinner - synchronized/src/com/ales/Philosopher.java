package com.ales;

public class Philosopher extends Thread {

    private String name;
    private Fork forkToLeftHand;
    private Fork forkToRightHand;
    private int food = 100;

    public Philosopher(String name, Fork forkToLeftHand, Fork forkToRightHand) {
        this.name = name;
        this.forkToLeftHand = forkToLeftHand;
        this.forkToRightHand = forkToRightHand;
    }

    @Override
    public void run() {
        while (food > 0) {
            synchronized (forkToLeftHand) {
                System.out.println(name + " Chytil " + forkToLeftHand.getName() + " levou rukou.");
                synchronized (forkToRightHand) {
                    System.out.println(name + " Chytil " + forkToRightHand.getName() + " pravou rukou.");
                    System.out.println(name + ": Mám obě vidličky, (" + forkToLeftHand.getName() + ", " + forkToRightHand.getName()
                            + ") takže můžu jíst!!(" + food + ")");
                    food--;
                }
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


}
