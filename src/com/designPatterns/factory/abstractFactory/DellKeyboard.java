package com.designPatterns.factory.abstractFactory;

public class DellKeyboard implements Keyboard {
    @Override
    public void pressEnter() {
        System.out.println("DellKeyboard pressEnter");
    }
}
