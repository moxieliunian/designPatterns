package com.designPatterns.factory.factoryMethod;

import com.designPatterns.factory.DellMouse;
import com.designPatterns.factory.Mouse;

public class DellMouseFactory implements MouseFactory{
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
