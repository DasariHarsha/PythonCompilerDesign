package AST;

public class SingleNewline implements ASTNode {
    String newline;
    
	public SingleNewline(String newline) {
		super();
		this.newline = newline;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new SingleNewline( "+newline+")");

	}

}
