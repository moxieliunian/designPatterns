package com.designPatterns.factory.abstractFactory;

import com.designPatterns.factory.Mouse;
import com.designPatterns.factory.factoryMethod.LenovoMouseFactory;
import com.designPatterns.factory.factoryMethod.MouseFactory;

public class Test {
    public void test(PCFactory pcFactory){
        Mouse mouse=pcFactory.createMouse();
        Keyboard keyboard=pcFactory.createKeyboard();
        mouse.click();
        keyboard.pressEnter();
    }
    public static void main(String[] args) {
        Test test=new Test();
        test.test(new RazerPCFactory());
    }
}
