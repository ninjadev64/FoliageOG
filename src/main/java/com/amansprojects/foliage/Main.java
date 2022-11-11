package com.amansprojects.foliage;

import com.amansprojects.foliage.antlr.*;

import java.io.BufferedReader;
import java.io.FileReader;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
	static FoliageParser parser;
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("main.leaf"));
    		StringBuilder sb = new StringBuilder();
		    String line = br.readLine();
		
		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String everything = sb.toString();
			
			FoliageLexer lexer = new FoliageLexer(CharStreams.fromString(everything));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parser = new FoliageParser(tokens);
			Listener listener = new Listener();
			parser.addParseListener(listener);
			parser.program();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}