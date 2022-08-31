package com.homework4.entity;

import com.homework4.util.ThreedUtil;

public class User implements Runnable {

    private final com.homework4.entity.CallCenter dataQueue;
    private volatile boolean runFlag;

    public User(com.homework4.entity.CallCenter dataQueue) {
        this.dataQueue = dataQueue;
        runFlag = true;
    }

    @Override
    public void run() {
        makeUserThread();
    }

    public void makeUserThread() {
        while (runFlag) {
            com.homework4.entity.FreeLine FreeLine;
            if (dataQueue.isEmpty()) {
                try {
                    dataQueue.waitOnEmpty();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
            if (!runFlag) {
                break;
            }

            FreeLine = dataQueue.remove();
            dataQueue.notifyForFull();
            useMessage(FreeLine);
        }
        System.out.println("User " + Thread.currentThread().getId() + " finished");
    }

    private void useMessage(com.homework4.entity.FreeLine FreeLine) {
        if (FreeLine != null) {
            System.out.println("User-" + Thread.currentThread().getName() + " have spoke with Operator" + FreeLine.getName());
            ThreedUtil.sleep((long) (FreeLine.getData() * 100));
        }
    }

    public void stop() {
        runFlag = false;
        dataQueue.notifyForEmpty();
    }
}