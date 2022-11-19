package com.amansprojects.foliage;

import com.amansprojects.foliage.antlr.*;

import java.io.BufferedReader;
import java.io.FileReader;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class FoliageCompiler {
	static FoliageParser parser;
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
			parser = new FoliageParser(new CommonTokenStream(lexer));
			ClassListener listener = new ClassListener();
			parser.addParseListener(listener);
			parser.program();

			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}