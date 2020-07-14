package com.designPatterns.factory.abstractFactory;

public class MicrosoftKeyboard implements Keyboard {
    @Override
    public void pressEnter() {
        System.out.println("MicrosoftKeyboard pressEnter");
    }
}
