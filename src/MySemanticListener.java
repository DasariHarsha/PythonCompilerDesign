import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;




public class MySemanticListener extends Python3ParserBaseListener {
    private Set<String> constants = new HashSet<>();
    private Set<String> variables = new HashSet<>();

    @Override
    public void exitExpr_stmt(Python3Parser.Expr_stmtContext ctx) {
    	ParseTree child = ctx.getChild(0);
        if (child instanceof TerminalNode) {
            TerminalNode terminalNode = (TerminalNode) child;

            // Access the text of the terminal node (identifier)
            //String identifier = terminalNode.getText().split(" ")[1];
            String identifier = terminalNode.getText();
            if(identifier.equals("VAL")) {
            	Python3Parser.Expr_stmtContext ctx1 = new Python3Parser.Expr_stmtContext(ctx, 0);
            	//exitPatternp(ctx1);
            }
        }
    }
    @Override
    public void exitAtom(Python3Parser.AtomContext ctx) {
    	ParseTree child = ctx.getChild(0);
        if (child instanceof TerminalNode) {
            TerminalNode terminalNode = (TerminalNode) child;
            // Access the text of the terminal node (identifier)
            //String identifier = terminalNode.getText().split(" ")[1];
            String identifier = terminalNode.getText();
            if (constants.contains(identifier)) {

                System.err.println("Semantic Error: Attempt to redeclare constant '" + identifier + "'");
            } else {
                constants.add(identifier);
            }
        }
       
    }

    }