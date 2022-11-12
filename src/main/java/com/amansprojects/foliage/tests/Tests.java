package com.amansprojects.foliage.tests;

import com.amansprojects.foliage.FoliageCompiler;

public class Tests {
    public static void main(String[] args) throws Exception {
        FoliageCompiler.compile("main.leaf");
        Class<?> c = Class.forName("GeneratedClass");
        System.out.println(c.getMethod("foo").invoke(null));
        System.out.println(c.getMethod("bar").invoke(null));
    }
}
