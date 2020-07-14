package com.designPatterns.factory.abstractFactory;

import com.designPatterns.factory.LenovoMouse;
import com.designPatterns.factory.Mouse;

public class LenovoPCFactory implements PCFactory{
    @Override
    public Mouse createMouse() {
        return new LenovoMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new LenovoKeyboard();
    }
}
