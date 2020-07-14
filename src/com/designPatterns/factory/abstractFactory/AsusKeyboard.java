package com.designPatterns.factory.abstractFactory;

public class AsusKeyboard implements Keyboard {
    @Override
    public void pressEnter() {
        System.out.println("AsusKeyboard pressEnter");
    }
}
