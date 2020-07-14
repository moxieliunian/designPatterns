package com.designPatterns.factory;


public class DellMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("DellMouse click");
    }
}
