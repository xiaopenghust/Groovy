package com.sharp;

import groovy.lang.GroovyObject;

/**
 * Created by 584003 on 2017/2/14.
 */
public class Main {
    public static void calcResult(int a, int b){
        GroovyObject groovyObject = GroovyTransform.transform("D:/work/Groovy/src/groovy/com/sharp/SubCalc.groovy");
        Object[] args = {a, b};
        Object c = groovyObject.invokeMethod("calc", args);
        System.out.println("结果是：" + c);
    }
    public static void main(String[] args){
        SharpConstant.val = 50;
        calcResult(10, 30);
    }
}
