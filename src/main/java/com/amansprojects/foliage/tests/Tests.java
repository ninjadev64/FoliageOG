package com.amansprojects.foliage.tests;

import com.amansprojects.foliage.FoliageCompiler;
import com.amansprojects.foliage.Logger;

public class Tests {
    public static void main(String[] args) throws Exception {
        Logger.level = Logger.LogLevel.TRACE;
        FoliageCompiler.compile("src/main/foliage/main.leaf");
        Class<?> c = Class.forName("GeneratedClass");
        System.out.println(c.getMethod("foo").invoke(null));
        System.out.println(c.getMethod("bar").invoke(null));
    }
}
