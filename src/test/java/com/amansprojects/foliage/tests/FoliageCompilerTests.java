package com.amansprojects.foliage.tests;

import org.junit.jupiter.api.Test;
import com.amansprojects.foliage.FoliageCompiler;
import com.amansprojects.foliage.Logger;

public class FoliageCompilerTests {
    @Test
    public void compilerTest() throws Exception {
        Logger.level = Logger.LogLevel.TRACE;
        FoliageCompiler.compile("src/main/foliage/main.leaf");
        Class<?> klass = Class.forName("GeneratedClass");
        System.out.println(klass.getMethod("foo").invoke(null));
        System.out.println(klass.getMethod("bar").invoke(null));
    }
}
