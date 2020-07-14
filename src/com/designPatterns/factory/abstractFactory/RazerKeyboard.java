package com.designPatterns.factory.abstractFactory;

public class RazerKeyboard implements Keyboard {
    @Override
    public void pressEnter() {
        System.out.println("RazerKeyboard pressEnter");
    }
}
