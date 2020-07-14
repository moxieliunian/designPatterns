package com.designPatterns.factory.abstractFactory;

public class LenovoKeyboard implements Keyboard {
    @Override
    public void pressEnter() {
        System.out.println("LenovoKeyboard pressEnter");
    }
}
