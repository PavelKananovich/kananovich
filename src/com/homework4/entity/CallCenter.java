package com.homework4.entity;

import java.util.LinkedList;
import java.util.Queue;

public class CallCenter {
    private final Queue<com.homework4.entity.FreeLine> queue = new LinkedList<>();
    private final int maxSize;
    private final Object FULL_QUEUE = new Object();
    private final Object EMPTY_QUEUE = new Object();

    public CallCenter(int maxSize) {
        this.maxSize = maxSize;
        System.out.println("call center has 3 operators");
        System.out.println("call center started to work");
        System.out.println("queue size " + queue.size());
    }

    public boolean isFull() {
        return queue.size() == maxSize;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void waitOnFull() throws InterruptedException {
        synchronized (FULL_QUEUE) {
            FULL_QUEUE.wait();
        }
    }

    public void waitOnEmpty() throws InterruptedException {
        synchronized (EMPTY_QUEUE) {
            EMPTY_QUEUE.wait();
        }
    }

    public void notifyForFull() {
        synchronized (FULL_QUEUE) {
            FULL_QUEUE.notifyAll();
        }
    }

    public void notifyForEmpty() {
        synchronized (EMPTY_QUEUE) {
            EMPTY_QUEUE.notifyAll();
        }
    }

    public void add(com.homework4.entity.FreeLine message) {
        synchronized (queue) {
            queue.add(message);
        }
    }

    public com.homework4.entity.FreeLine remove() {
        synchronized (queue) {
            return queue.poll();
        }
    }

    public Queue<com.homework4.entity.FreeLine> getQueue() {
        return queue;
    }
}