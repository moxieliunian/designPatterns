package com.designPatterns.factory.factoryMethod;

import com.designPatterns.factory.Mouse;
import com.designPatterns.factory.RazerMouse;

public class RazerMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new RazerMouse();
    }
}
