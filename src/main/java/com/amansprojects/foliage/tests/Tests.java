package com.amansprojects.foliage.tests;

import com.amansprojects.foliage.FoliageCompiler;

public class Tests {
    public static void main(String[] args) throws Exception {
        FoliageCompiler.compile("main.leaf");
        Class<?> c = Class.forName("GeneratedClass");
        System.out.println(c.getMethod("0").invoke(null));
        System.out.println(c.getMethod("1").invoke(null));
    }
}
