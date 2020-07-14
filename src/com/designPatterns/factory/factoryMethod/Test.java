package com.designPatterns.factory.factoryMethod;

import com.designPatterns.factory.Mouse;

public class Test {
    public void test(MouseFactory mouseFactory){
        Mouse mouse=mouseFactory.createMouse();
        mouse.click();
    }
    public static void main(String[] args) {
        Test test=new Test();
        test.test(new LenovoMouseFactory());
    }
}
