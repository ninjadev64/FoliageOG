package com.amansprojects.foliage;

import com.amansprojects.foliage.antlr.*;

import java.io.BufferedReader;
import java.io.FileReader;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import org.apache.commons.lang3.exception.ExceptionUtils;

public class FoliageCompiler {
	public static void compile(String filename) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
    		StringBuilder sb = new StringBuilder();
		    String line = br.readLine();
		
		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
			
			FoliageLexer lexer = new FoliageLexer(CharStreams.fromString(sb.toString()));
			FoliageParser parser = new FoliageParser(new CommonTokenStream(lexer));
			ClassListener listener = new ClassListener();
			parser.addParseListener(listener);
			parser.program();

			br.close();
		} catch (Exception e) {
			Logger.error("Failed to compile file " + filename + ": " + ExceptionUtils.getMessage(e));
		}
	}
}