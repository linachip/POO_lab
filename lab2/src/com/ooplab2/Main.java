package com.ooplab2;

public class Main {

    public static void main(String[] args) {
        Box box0 = new Box();
        Box box1 = new Box(5);
        Box box2 = new Box(15, 20, 25);

        System.out.println("First box: ");
        box0.ShowBox();

        System.out.println("Second box: ");
        box1.ShowBox();

        System.out.println("Third box: ");
        box2.ShowBox();
        box2.BoxCalculations();

        Queue queue1 = new Queue();
        Queue queue2 = new Queue(3);

        System.out.println("Unlimited Queue: ");
        queue1.PushForUnlimitedQueue(5);
        queue1.PushForUnlimitedQueue(6);
        queue1.showUnlimitedQueue();
        System.out.println("");
        queue1.PushForUnlimitedQueue(2);
        System.out.println("");
        queue1.PopForUnlimitedQueue();
        System.out.println("");
        queue1.PushForUnlimitedQueue(7);
        queue2.PushForLimitedQueue(2);
        queue2.PushForLimitedQueue(8);
        queue2.PopForLimitedQueue();

    }
}