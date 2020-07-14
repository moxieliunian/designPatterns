package com.designPatterns.factory;


public class MicrosoftMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("MicrosoftMouse click");
    }
}
