package com.ooplab2;

import java.util.ArrayList;

public class Queue {
    private int maxSize=0;
    private int Size;
    private int count=0;
    private ArrayList<Integer> q = new ArrayList<Integer>();
    private ArrayList<Integer> q2 = new ArrayList<>();

    Queue() {
        Size = 0;
    }

    Queue(int maxSize) {
        this.maxSize = maxSize;
    }

    public int PushForLimitedQueue(int value) {

        if (q.size() == 0 && maxSize == 0) {
            System.out.println("Empty Queue ");
        }
        else if (q.size() != maxSize) {
            q.add(count, value);
            count++;
            System.out.println("Queue isn't empty ");
            System.out.println("Queue isn't full ");
        } else{
            System.out.println("Queue is full ");
        }
        return count;
    }

    public int PushForUnlimitedQueue(int value){
        System.out.println("Queue isn't full ");
        if(q2.size()==0){
            System.out.println("Empty Queue ");
        } else{
            q2.add(count, value);
            count++;
            System.out.println("Queue isn't empty ");
        }
        return count;
    }

    public int PopForLimitedQueue(){
        q.remove(0);
        count--;
        if(q.size()==0){
            System.out.println("Empty Queue ");
        }
        else{
            System.out.println("Queue isn't empty ");
        System.out.println("Queue isn't full");}
        return count;
    }

    public int PopForUnlimitedQueue(){
        q2.remove(0);
        count--;
        System.out.println("Queue isn't full");
        return count;
    }

     public void showLimitedQueue(){
        for (int k=0; k<count; k++)
        System.out.println(q.get(k));
     }

     public void showUnlimitedQueue(){
        for (int k=0; k<count; k++)
            System.out.println(q2.get(k));
     }
}

