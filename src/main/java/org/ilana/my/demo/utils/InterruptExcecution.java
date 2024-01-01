package org.ilana.my.demo.utils;

public class InterruptExcecution {

    public static void stop() {
        try {
            Thread.sleep(6000);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
