package com.designPatterns.factory.simpleFactory;

import com.designPatterns.factory.*;


public class SimpleMouseFactory {
    public static Mouse createMouse(String type){
        Mouse mouse=null;
        if ("DELL".equalsIgnoreCase(type)){
            mouse=new DellMouse();
        }else if ("MICROSOFT".equalsIgnoreCase(type)){
            mouse=new MicrosoftMouse();
        }else if ("RAZER".equalsIgnoreCase(type)){
            mouse=new RazerMouse();
        }else if ("ASUS".equalsIgnoreCase(type)){
            mouse=new AsusMouse();
        }else {
            throw new IllegalArgumentException("no such type !");
        }
        return mouse;
    }

}
