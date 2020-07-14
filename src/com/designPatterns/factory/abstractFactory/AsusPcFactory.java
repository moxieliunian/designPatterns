package com.designPatterns.factory.abstractFactory;

import com.designPatterns.factory.AsusMouse;
import com.designPatterns.factory.Mouse;

public class AsusPcFactory implements PCFactory{

    @Override
    public Mouse createMouse() {
        return new AsusMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new AsusKeyboard();
    }


}
