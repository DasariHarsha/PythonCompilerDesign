import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CommonTokenStream;


public class Main {

	public static void main(String[] args) throws IOException {
		ANTLRFileStream input = new ANTLRFileStream(args[0]);
        ANTLRInputStream ip = new ANTLRInputStream(input.toString());
        
        Python3Lexer lex = new Python3Lexer(ip);
        Token token;
        
        CommonTokenStream tokStream = new CommonTokenStream(lex);
        Python3Parser parser = new Python3Parser(tokStream);
        MySemanticListener semanticListener = new MySemanticListener();

        // Add the listener to the parser
        parser.addParseListener(semanticListener);
        parser.program();
	}	
}
