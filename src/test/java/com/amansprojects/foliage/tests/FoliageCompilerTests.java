package com.amansprojects.foliage.tests;

import com.amansprojects.foliage.FoliageCompiler;
import com.amansprojects.foliage.Logger;
import org.junit.jupiter.api.Test;

import javax.tools.ToolProvider;
import com.amansprojects.foliage.generated.GeneratedClass;

public class FoliageCompilerTests {
    @Test
    public void compilerTest() throws Exception {
        ToolProvider.getSystemJavaCompiler().run(null, null, null, "Printer.java");
        Runtime.getRuntime().exec("mv Printer.class target/classes/");
        Logger.level = Logger.LogLevel.TRACE;
        FoliageCompiler.compile("src/main/foliage/main.leaf");
        System.out.println(GeneratedClass.foo());
        System.out.println(GeneratedClass.bar());
    }
}
