package com.designPatterns.factory.abstractFactory;

import com.designPatterns.factory.Mouse;
import com.designPatterns.factory.RazerMouse;

public class RazerPCFactory implements PCFactory {
    @Override
    public Mouse createMouse() {
        return new RazerMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new RazerKeyboard();
    }
}
