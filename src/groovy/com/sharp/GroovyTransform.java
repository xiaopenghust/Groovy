package com.sharp;

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;

import java.io.File;

/**
 * Created by 584003 on 2017/2/14.
 */
public class GroovyTransform {
    public static GroovyObject transform(String filePath) {
//        ClassLoader javaLoader = GroovyTransform.class.getClass().getClassLoader();
        GroovyClassLoader groovyLoader = new GroovyClassLoader();
        try {
            Class groovyClass = groovyLoader.parseClass(new File(filePath));
            GroovyObject groovyObject = (GroovyObject) groovyClass.newInstance();
            return groovyObject;
        }catch (Exception  ex){
            ex.printStackTrace();
            return null;
        }
    }
}
