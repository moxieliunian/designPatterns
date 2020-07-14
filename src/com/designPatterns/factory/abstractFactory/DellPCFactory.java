package com.designPatterns.factory.abstractFactory;

import com.designPatterns.factory.DellMouse;
import com.designPatterns.factory.Mouse;

public class DellPCFactory implements PCFactory{
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
