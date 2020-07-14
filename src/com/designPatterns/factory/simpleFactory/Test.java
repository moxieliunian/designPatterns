package com.designPatterns.factory.simpleFactory;

import com.designPatterns.factory.Mouse;


public class Test {
    public void test(String type){
        Mouse mouse=SimpleMouseFactory.createMouse(type);
        mouse.click();
    }
    public static void main(String[] args) {
        Test test=new Test();
        test.test("dell");
    }
}
