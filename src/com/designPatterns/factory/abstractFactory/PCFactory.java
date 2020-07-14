package com.designPatterns.factory.abstractFactory;

import com.designPatterns.factory.Mouse;

public interface PCFactory {
    Mouse createMouse();
    Keyboard createKeyboard();
}
