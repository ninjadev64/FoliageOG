package com.amansprojects.foliage.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.amansprojects.foliage.FoliageCompiler;
import com.amansprojects.foliage.Logger;

public class FoliageCompilerTests {
    @Test
    public void compilerTest() throws Exception {
        Logger.level = Logger.LogLevel.TRACE;
        FoliageCompiler.compile("src/main/foliage/main.leaf");
        Class<?> klass = Class.forName("GeneratedClass");
        assertEquals(4613.86, (float) klass.getMethod("foo").invoke(null), 0.05);
        assertEquals(72, (int) klass.getMethod("bar").invoke(null));
    }
}
