package com.designPatterns.factory.abstractFactory;

import com.designPatterns.factory.MicrosoftMouse;
import com.designPatterns.factory.Mouse;

public class MicrosoftPCFactory implements PCFactory {
    @Override
    public Mouse createMouse() {
        return new MicrosoftMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new MicrosoftKeyboard();
    }
}
