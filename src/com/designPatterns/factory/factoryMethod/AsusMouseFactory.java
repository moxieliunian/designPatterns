package com.designPatterns.factory.factoryMethod;

import com.designPatterns.factory.AsusMouse;
import com.designPatterns.factory.Mouse;

public class AsusMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new AsusMouse();
    }
}
