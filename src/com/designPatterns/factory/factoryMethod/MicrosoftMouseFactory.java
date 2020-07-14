package com.designPatterns.factory.factoryMethod;

import com.designPatterns.factory.MicrosoftMouse;
import com.designPatterns.factory.Mouse;

public class MicrosoftMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new MicrosoftMouse();
    }
}
