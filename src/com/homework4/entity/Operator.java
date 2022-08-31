package com.homework4.entity;

import util.ThreedUtil;

public class Operator implements Runnable {

    private static int counter = 0;
    private final CallCenter callCenter;
        private volatile boolean runFlag;
    private static int idSequence = 0;

    public Operator(CallCenter callCenter) {
        this.callCenter = callCenter;
        runFlag = true;
    }

    public Operator(CallCenter callCenter, CallCenter callCenter1) {

        this.callCenter = callCenter1;
    }

    @Override
    public void run() {
        makeThreadOperation();
    }

    public void makeThreadOperation() {
        while (runFlag) {
            FreeLine message = generateMessage();
            while (callCenter.isFull()) {
                try {
                    callCenter.waitOnFull();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
            if (!runFlag) {

                break;
            }
            callCenter.add(message);
            System.out.println("Operator-" + Thread.currentThread().getName() + " is free");
            callCenter.notifyForEmpty();

        }
        System.out.println("Operator " + Thread.currentThread().getId() + " Stopped");
    }

    private FreeLine generateMessage() {
        FreeLine message = new FreeLine(++idSequence, Math.random(), Thread.currentThread().getName());
        ThreedUtil.sleep((long) (message.getData() * 50));
        return message;
    }

    public void stop() {
        runFlag = false;
        callCenter.notifyForFull();
    }
}