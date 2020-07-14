package com.designPatterns.factory.factoryMethod;

import com.designPatterns.factory.LenovoMouse;
import com.designPatterns.factory.Mouse;

public class LenovoMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new LenovoMouse();
    }
}
